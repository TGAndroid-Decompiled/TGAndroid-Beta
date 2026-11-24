package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AsusHomeBadger implements bm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", dm7.d.getPackageName());
        intent.putExtra("badge_count_class_name", dm7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (dm7.a(intent)) {
            gm.c3(new hl(intent, (byte) 3));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
