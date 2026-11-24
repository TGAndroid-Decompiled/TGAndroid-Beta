package org.telegram.messenger;

import android.content.AsyncQueryHandler;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$SonyHomeBadger implements yj7 {
    public static zj7 b;
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override
    public final void a(int i) {
        boolean z = false;
        if (a.b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            if (i < 0) {
                return;
            }
            if (b == null) {
                b = new AsyncQueryHandler(a.b.getApplicationContext().getContentResolver());
            }
            String packageName = ak7.d.getPackageName();
            String className = ak7.d.getClassName();
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i));
            contentValues.put("package_name", packageName);
            contentValues.put("activity_name", className);
            b.startInsert(0, null, this.a, contentValues);
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", ak7.d.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", ak7.d.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        if (i > 0) {
            z = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
        gl.c3(new hk(intent, (byte) 5));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
