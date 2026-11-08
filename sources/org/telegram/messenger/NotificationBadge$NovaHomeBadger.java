package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NovaHomeBadger implements cs {
    @Override
    public final void a(int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", fs.d.getPackageName() + "/" + fs.d.getClassName());
        contentValues.put("count", Integer.valueOf(i7));
        t0.f25566b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
