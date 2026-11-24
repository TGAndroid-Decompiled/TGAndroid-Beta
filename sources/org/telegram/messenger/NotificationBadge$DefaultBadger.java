package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$DefaultBadger implements yj7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", ak7.d.getPackageName());
        intent.putExtra("badge_count_class_name", ak7.d.getClassName());
        gl.c3(new hk(intent, (byte) 4));
    }

    @Override
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
