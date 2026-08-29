package org.telegram.messenger;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.RemoteViews;
import org.telegram.ui.LaunchActivity;
public class FeedWidgetProvider extends AppWidgetProvider {
    public static void updateWidget(Context context, AppWidgetManager appWidgetManager, int i10) {
        Intent intent = new Intent(context, FeedWidgetService.class);
        intent.putExtra("appWidgetId", i10);
        intent.setData(Uri.parse(intent.toUri(1)));
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.feed_widget_layout);
        remoteViews.setRemoteAdapter(R.id.list_view, intent);
        remoteViews.setEmptyView(R.id.list_view, R.id.empty_view);
        Intent intent2 = new Intent(ApplicationLoader.applicationContext, LaunchActivity.class);
        intent2.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent2.addFlags(67108864);
        intent2.addCategory("android.intent.category.LAUNCHER");
        remoteViews.setPendingIntentTemplate(R.id.list_view, PendingIntent.getActivity(ApplicationLoader.applicationContext, 0, intent2, 167772160));
        appWidgetManager.updateAppWidget(i10, remoteViews);
    }

    @Override
    public void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            SharedPreferences.Editor edit = context.getSharedPreferences("shortcut_widget", 0).edit();
            SharedPreferences.Editor remove = edit.remove("account" + iArr[i10]);
            remove.remove("dialogId" + iArr[i10]).commit();
        }
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
