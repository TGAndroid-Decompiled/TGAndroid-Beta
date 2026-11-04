package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class NotificationBadge$SamsungHomeBadger implements ur {
    public static final String[] f21371a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger f21372b;

    public static ContentValues c(ComponentName componentName, int i3, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i3));
        return contentValues;
    }

    @Override
    public final void a(int i3) {
        try {
            if (f21372b == null) {
                f21372b = new NotificationBadge$DefaultBadger();
            }
            f21372b.a(i3);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = t0.f25457b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f21371a, "package=?", new String[]{wr.d.getPackageName()}, null);
            if (cursor != null) {
                String className = wr.d.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(wr.d, i3, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(wr.d, i3, true));
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th2) {
            LinkedList linkedList = wr.f26250a;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th2;
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}
