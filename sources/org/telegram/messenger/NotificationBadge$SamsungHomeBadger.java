package org.telegram.messenger;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class NotificationBadge$SamsungHomeBadger implements xr {
    public static final String[] f22794a = {"_id", "class"};
    public static NotificationBadge$DefaultBadger f22795b;

    public static ContentValues c(ComponentName componentName, int i7, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i7));
        return contentValues;
    }

    @Override
    public final void a(int i7) {
        try {
            if (f22795b == null) {
                f22795b = new NotificationBadge$DefaultBadger();
            }
            f22795b.a(i7);
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = t0.f26931b.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f22794a, "package=?", new String[]{as.d.getPackageName()}, null);
            if (cursor != null) {
                String className = as.d.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(as.d, i7, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(as.d, i7, true));
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th2) {
            LinkedList linkedList = as.f22964a;
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
