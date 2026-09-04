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
    private a0.i dialogs = new a0.i();
    private a0.i messageObjects = new a0.i();

    public ChatsRemoteViewsFactory(Context context, Intent intent) {
        this.mContext = context;
        org.telegram.ui.ActionBar.j6.R(context);
        boolean z10 = false;
        this.appWidgetId = intent.getIntExtra("appWidgetId", 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        int i10 = sharedPreferences.getInt("account" + this.appWidgetId, -1);
        if (i10 >= 0) {
            this.accountInstance = AccountInstance.getInstance(i10);
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
    public long getItemId(int i10) {
        return i10;
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
            a0.i iVar = new a0.i();
            this.accountInstance.getMessagesStorage().getWidgetDialogs(this.appWidgetId, 0, this.dids, this.dialogs, iVar, arrayList, arrayList2);
            this.accountInstance.getMessagesController().putUsers(arrayList, true);
            this.accountInstance.getMessagesController().putChats(arrayList2, true);
            this.messageObjects.b();
            int m10 = iVar.m();
            for (int i10 = 0; i10 < m10; i10++) {
                this.messageObjects.k(new MessageObject(this.accountInstance.getCurrentAccount(), (TLRPC.Message) iVar.n(i10), (a0.i) null, (a0.i) null, false, true), iVar.j(i10));
            }
        }
    }

    @Override
    public void onDestroy() {
    }
}
