package org.telegram.messenger;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public class NotificationBadge$ZukHomeBadger implements ls {
    public final Uri f14510a = Uri.parse("content://com.android.badge/badge");

    @Override
    public final void a(int i10) {
        i0.g3(new hr(8, this, org.telegram.ui.Cells.f1.i(i10, "app_badge_count")));
    }

    @Override
    public final List b() {
        return Collections.singletonList("com.zui.launcher");
    }
}
