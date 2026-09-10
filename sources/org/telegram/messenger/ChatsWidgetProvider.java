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
    private static int getCellsForSize(int i10) {
        int i11 = 2;
        while (i11 * 72 < i10) {
            i11++;
        }
        return i11 - 1;
    }

    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i10) {
        int i11;
        int i12;
        ApplicationLoader.postInitApplication();
        int cellsForSize = getCellsForSize(appWidgetManager.getAppWidgetOptions(i10).getInt("appWidgetMaxHeight"));
        Intent intent = new Intent(context, ChatsWidgetService.class);
        intent.putExtra("appWidgetId", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        if (!sharedPreferences.getBoolean("deleted" + i10, false)) {
            int i13 = sharedPreferences.getInt("account" + i10, -1);
            if (i13 == -1) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt(hc.b.j(i10, "account"), UserConfig.selectedAccount);
                edit.putInt("type" + i10, 0).commit();
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (i13 >= 0) {
                i11 = i10;
                AccountInstance.getInstance(i13).getMessagesStorage().getWidgetDialogIds(i11, 0, arrayList, null, null, false);
            } else {
                i11 = i10;
            }
            if (cellsForSize != 1 && arrayList.size() > 1) {
                if (cellsForSize != 2 && arrayList.size() > 2) {
                    if (cellsForSize != 3 && arrayList.size() > 3) {
                        i12 = R.layout.shortcut_widget_layout_4;
                    } else {
                        i12 = R.layout.shortcut_widget_layout_3;
                    }
                } else {
                    i12 = R.layout.shortcut_widget_layout_2;
                }
            } else {
                i12 = R.layout.shortcut_widget_layout_1;
            }
        } else {
            i11 = i10;
            i12 = R.layout.shortcut_widget_layout_1;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i12);
        remoteViews.setRemoteAdapter(i11, R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i11, remoteViews);
        appWidgetManager.notifyAppWidgetViewDataChanged(i11, R.id.list_view);
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        updateWidget(context, appWidgetManager, i10);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
    }

    @Override
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        ApplicationLoader.postInitApplication();
        SharedPreferences sharedPreferences = context.getSharedPreferences("shortcut_widget", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = sharedPreferences.getInt("account" + iArr[i10], -1);
            if (i11 >= 0) {
                AccountInstance.getInstance(i11).getMessagesStorage().clearWidgetDialogs(iArr[i10]);
            }
            edit.remove("account" + iArr[i10]);
            edit.remove("type" + iArr[i10]);
            edit.remove("deleted" + iArr[i10]);
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
        for (int i10 : iArr) {
            updateWidget(context, appWidgetManager, i10);
        }
    }
}
