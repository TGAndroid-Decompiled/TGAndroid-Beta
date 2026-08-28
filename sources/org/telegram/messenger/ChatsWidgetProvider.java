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
import org.telegram.ui.LaunchActivity;
public class ChatsWidgetProvider extends AppWidgetProvider {
    private static int getCellsForSize(int i9) {
        int i10 = 2;
        while (i10 * 72 < i9) {
            i10++;
        }
        return i10 - 1;
    }

    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i9) {
        int i10;
        int i11;
        ApplicationLoader.postInitApplication();
        int cellsForSize = getCellsForSize(appWidgetManager.getAppWidgetOptions(i9).getInt("appWidgetMaxHeight"));
        Intent intent = new Intent(context, ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i9);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        if (!sharedPreferences.getBoolean("deleted" + i9, false)) {
            int i12 = sharedPreferences.getInt("account" + i9, -1);
            if (i12 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(j3.r0.l(i9, "account"), UserConfig.selectedAccount);
                edit.putInt("type" + i9, 0).commit();
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (i12 >= 0) {
                i10 = i9;
                AccountInstance.getInstance(i12).getMessagesStorage().getWidgetDialogIds(i10, 0, arrayList, null, null, false);
            } else {
                i10 = i9;
            }
            if (cellsForSize != 1 && arrayList.size() > 1) {
                if (cellsForSize != 2 && arrayList.size() > 2) {
                    if (cellsForSize != 3 && arrayList.size() > 3) {
                        i11 = R.layout.shortcut_widget_layout_4;
                    } else {
                        i11 = R.layout.shortcut_widget_layout_3;
                    }
                } else {
                    i11 = R.layout.shortcut_widget_layout_2;
                }
            } else {
                i11 = R.layout.shortcut_widget_layout_1;
            }
        } else {
            i10 = i9;
            i11 = R.layout.shortcut_widget_layout_1;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i11);
        remoteViews.setRemoteAdapter(i10, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i10, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i10, R.id.list_view);
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i9, Bundle bundle) {
        updateWidget(context, appWidgetManager, i9);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i9, bundle);
    }

    @Override
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        ApplicationLoader.postInitApplication();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int i10 = sharedPreferences.getInt("account" + iArr[i9], -1);
            if (i10 >= 0) {
                AccountInstance.getInstance(i10).getMessagesStorage().clearWidgetDialogs(iArr[i9]);
            }
            edit.remove("account" + iArr[i9]);
            edit.remove("type" + iArr[i9]);
            edit.remove("deleted" + iArr[i9]);
        }
        edit.commit();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        for (int i9 : iArr) {
            updateWidget(context, appWidgetManager, i9);
        }
    }
}
