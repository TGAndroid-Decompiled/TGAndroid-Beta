package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements bm7 {
    public final Uri a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i) {
        gm.c3(new bl7(this, kt6.j(i, "app_badge_count"), (byte) 6));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
