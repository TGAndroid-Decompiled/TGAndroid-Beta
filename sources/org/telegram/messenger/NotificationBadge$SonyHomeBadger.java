package org.telegram.messenger;

import android.content.AsyncQueryHandler;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$SonyHomeBadger implements zr {
    public static bs f22402b;
    public final Uri f22403a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override
    public final void a(int i7) {
        boolean z10 = false;
        if (t0.f26609b.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            if (i7 < 0) {
                return;
            }
            if (f22402b == null) {
                f22402b = new AsyncQueryHandler(t0.f26609b.getApplicationContext().getContentResolver());
            }
            String packageName = cs.d.getPackageName();
            String className = cs.d.getClassName();
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i7));
            contentValues.put("package_name", packageName);
            contentValues.put("activity_name", className);
            f22402b.startInsert(0, null, this.f22403a, contentValues);
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", cs.d.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", cs.d.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i7));
        if (i7 > 0) {
            z10 = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z10);
        g0.h3(new s(intent, 5));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}
