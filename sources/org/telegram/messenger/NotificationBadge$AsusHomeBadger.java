package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AsusHomeBadger implements xr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i7);
        intent.putExtra("badge_count_package_name", as.d.getPackageName());
        intent.putExtra("badge_count_class_name", as.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (as.a(intent)) {
            g0.g3(new s(intent, 3));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
