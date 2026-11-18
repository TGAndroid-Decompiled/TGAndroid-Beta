package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements wr {
    public final Uri f22767a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i7) {
        g0.g3(new rq(12, this, p5.c.f(i7, "app_badge_count")));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
