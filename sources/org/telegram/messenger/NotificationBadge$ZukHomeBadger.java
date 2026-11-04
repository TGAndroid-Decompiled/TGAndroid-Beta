package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements ur {
    public final Uri f21375a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i3) {
        g0.h3(new pq(10, this, org.telegram.ui.Cells.f1.k(i3, "app_badge_count")));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
