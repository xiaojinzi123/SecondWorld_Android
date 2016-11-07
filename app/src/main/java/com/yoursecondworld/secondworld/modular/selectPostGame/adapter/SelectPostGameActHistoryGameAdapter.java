package com.yoursecondworld.secondworld.modular.selectPostGame.adapter;

import android.content.Context;

import com.yoursecondworld.secondworld.R;

import java.util.List;

import xiaojinzi.base.android.adapter.recyclerView.CommonRecyclerViewAdapter;
import xiaojinzi.base.android.adapter.recyclerView.CommonRecyclerViewHolder;

/**
 * Created by cxj on 2016/10/23.
 */
public class SelectPostGameActHistoryGameAdapter extends CommonRecyclerViewAdapter<String> {

    /**
     * 构造函数
     *
     * @param context 上下文
     * @param data    显示的数据
     */
    public SelectPostGameActHistoryGameAdapter(Context context, List<String> data) {
        super(context, data);
    }

    @Override
    public void convert(CommonRecyclerViewHolder h, String entity, int position) {
        //设置文本到控件上
        h.setText(R.id.tv_game_name, entity);
    }

    @Override
    public int getLayoutViewId(int viewType) {
        return R.layout.act_select_post_game_history_game_item;
    }
}