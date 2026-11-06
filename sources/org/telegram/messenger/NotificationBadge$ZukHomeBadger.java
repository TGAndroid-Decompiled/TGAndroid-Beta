package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements cs {
    public final Uri f21321a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i7) {
        g0.h3(new yq(10, this, rf.b.f(i7, "app_badge_count")));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
