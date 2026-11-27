package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements xm7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i) {
        hl.c3(new pl7(this, qu6.j(i, "app_badge_count"), (byte) 3));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
