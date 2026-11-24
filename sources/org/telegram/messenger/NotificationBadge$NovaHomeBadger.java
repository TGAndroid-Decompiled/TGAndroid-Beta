package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NovaHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", ak7.d.getPackageName() + "/" + ak7.d.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        a.b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
