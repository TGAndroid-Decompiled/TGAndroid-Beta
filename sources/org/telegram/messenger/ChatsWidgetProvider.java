package org.telegram.messenger;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

public class ChatsWidgetProvider extends AppWidgetProvider {
    private static int getCellsForSize(int i) {
        int i2 = 2;
        while (i2 * 72 < i) {
            i2++;
        }
        return i2 - 1;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i : iArr) {
            updateWidget(context, appWidgetManager, i);
        }
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        updateWidget(context, appWidgetManager, i);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
    }

    @Override
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        ApplicationLoader.postInitApplication();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = sharedPreferences.getInt("account" + iArr[i], -1);
            if (i2 >= 0) {
                AccountInstance.getInstance(i2).getMessagesStorage().clearWidgetDialogs(iArr[i]);
            }
            edit.remove("account" + iArr[i]);
            edit.remove("type" + iArr[i]);
            edit.remove("deleted" + iArr[i]);
        }
        edit.commit();
    }

    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i) {
        int i2;
        ApplicationLoader.postInitApplication();
        int cellsForSize = getCellsForSize(appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMaxHeight"));
        Intent intent = new Intent(context, (Class<?>) ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        if (!sharedPreferences.getBoolean("deleted" + i, false)) {
            int i3 = sharedPreferences.getInt("account" + i, -1);
            if (i3 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("account" + i, UserConfig.selectedAccount);
                edit.putInt("type" + i, 0).commit();
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (i3 >= 0) {
                AccountInstance.getInstance(i3).getMessagesStorage().getWidgetDialogIds(i, 0, arrayList, null, null, false);
            }
            if (cellsForSize == 1 || arrayList.size() <= 1) {
                i2 = R.layout.shortcut_widget_layout_1;
            } else if (cellsForSize == 2 || arrayList.size() <= 2) {
                i2 = R.layout.shortcut_widget_layout_2;
            } else if (cellsForSize == 3 || arrayList.size() <= 3) {
                i2 = R.layout.shortcut_widget_layout_3;
            } else {
                i2 = R.layout.shortcut_widget_layout_4;
            }
        } else {
            i2 = R.layout.shortcut_widget_layout_1;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i2);
        int i4 = R.id.list_view;
        remoteViews.setRemoteAdapter(i, i4, intent);
        remoteViews.setEmptyView(i4, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
        intent2.addFlags(ConnectionsManager.FileTypeFile);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(i4, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i, i4);
    }
}
