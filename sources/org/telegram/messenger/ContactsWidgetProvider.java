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
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;

public class ContactsWidgetProvider extends AppWidgetProvider {
    private static int getCellsForSize(int i) {
        int i2 = 2;
        while (i2 * 86 < i) {
            i2++;
        }
        return i2 - 1;
    }

    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i) {
        int i2;
        int i3;
        ApplicationLoader.postInitApplication();
        int cellsForSize = getCellsForSize(appWidgetManager.getAppWidgetOptions(i).getInt("appWidgetMaxHeight"));
        Intent intent = new Intent(context, (Class<?>) ContactsWidgetService.class);
        intent.putExtra("appWidgetId", i);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        if (sharedPreferences.getBoolean("deleted" + i, false)) {
            i2 = i;
            i3 = R.layout.contacts_widget_layout_1;
        } else {
            int i4 = sharedPreferences.getInt("account" + i, -1);
            if (i4 == -1) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(DiffUtil.m(i, "account"), UserConfig.selectedAccount);
                editorEdit.putInt("type" + i, 0).commit();
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (i4 >= 0) {
                i2 = i;
                AccountInstance.getInstance(i4).getMessagesStorage().getWidgetDialogIds(i2, 1, arrayList, null, null, false);
            } else {
                i2 = i;
            }
            int iCeil = (int) Math.ceil(arrayList.size() / 2.0f);
            if (cellsForSize == 1 || iCeil <= 1) {
                i3 = R.layout.contacts_widget_layout_1;
            } else if (cellsForSize == 2 || iCeil <= 2) {
                i3 = R.layout.contacts_widget_layout_2;
            } else {
                i3 = (cellsForSize == 3 || iCeil <= 3) ? R.layout.contacts_widget_layout_3 : R.layout.contacts_widget_layout_4;
            }
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i3);
        int i5 = R.id.list_view;
        remoteViews.setRemoteAdapter(i2, i5, intent);
        remoteViews.setEmptyView(i5, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(i5, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i2, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i2, i5);
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
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = sharedPreferences.getInt("account" + iArr[i], -1);
            if (i2 >= 0) {
                AccountInstance.getInstance(i2).getMessagesStorage().clearWidgetDialogs(iArr[i]);
            }
            editorEdit.remove("account" + iArr[i]);
            editorEdit.remove("type" + iArr[i]);
            editorEdit.remove("deleted" + iArr[i]);
        }
        editorEdit.commit();
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
}
