package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
class ChatsRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
    private AccountInstance accountInstance;
    private int appWidgetId;
    private RectF bitmapRect;
    private boolean deleted;
    private Context mContext;
    private Paint roundPaint;
    private ArrayList<Long> dids = new ArrayList<>();
    private a0.h dialogs = new a0.h();
    private a0.h messageObjects = new a0.h();

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        org.telegram.ui.ActionBar.f6.R(context);
        boolean z10 = false;
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i9 = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i9 >= 0) {
            this.accountInstance = AccountInstance.getInstance(i9);
        }
        StringBuilder sb2 = new StringBuilder("deleted");
        sb2.append(this.appWidgetId);
        this.deleted = (sharedPreferences.getBoolean(sb2.toString(), false) || this.accountInstance == null) ? true : true;
    }

    @Override
    public int getCount() {
        if (this.deleted) {
            return 1;
        }
        return this.dids.size() + 1;
    }

    @Override
    public long getItemId(int i9) {
        return i9;
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public android.widget.RemoteViews getViewAt(int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ChatsRemoteViewsFactory.getViewAt(int):android.widget.RemoteViews");
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public void onCreate() {
        ApplicationLoader.postInitApplication();
    }

    @Override
    public void onDataSetChanged() {
        this.dids.clear();
        this.messageObjects.b();
        AccountInstance accountInstance = this.accountInstance;
        if (accountInstance != null && accountInstance.getUserConfig().isClientActivated()) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            ArrayList<TLRPC.Chat> arrayList2 = new ArrayList<>();
            a0.h hVar = new a0.h();
            this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, hVar, arrayList, arrayList2);
            this.accountInstance.getMessagesController().putUsers(arrayList, true);
            this.accountInstance.getMessagesController().putChats(arrayList2, true);
            this.messageObjects.b();
            int m10 = hVar.m();
            for (int i9 = 0; i9 < m10; i9++) {
                this.messageObjects.k(new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) hVar.n(i9), (a0.h) null, (a0.h) null, false, true), hVar.j(i9));
            }
        }
    }

    @Override
    public void onDestroy() {
    }
}
