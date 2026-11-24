package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements yj7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i) {
        gl.c3(new bj7(this, ls6.j(i, "app_badge_count"), (byte) 5));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
