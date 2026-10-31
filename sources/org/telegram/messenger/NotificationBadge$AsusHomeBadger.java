package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AsusHomeBadger implements ls {
    @Override
    public final void a(int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", os.d.getPackageName());
        intent.putExtra("badge_count_class_name", os.d.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (os.a(intent)) {
            i0.g3(new t(intent, 3));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.asus.launcher");
    }
}
