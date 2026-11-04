package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NovaHomeBadger implements ur {
    @Override
    public final void a(int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", wr.d.getPackageName() + "/" + wr.d.getClassName());
        contentValues.put("count", Integer.valueOf(i3));
        t0.f25457b.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    @Override
    public final List b() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }
}
