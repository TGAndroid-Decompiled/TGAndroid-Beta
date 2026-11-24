package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AsusHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", ak7.d.getPackageName());
        intent.putExtra("badge_count_class_name", ak7.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (ak7.a(intent)) {
            gl.d3(new hk(intent, (byte) 3));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
