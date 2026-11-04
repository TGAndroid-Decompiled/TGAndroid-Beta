package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$DefaultBadger implements ur {
    @Override
    public final void a(int i3) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i3);
        intent.putExtra("badge_count_package_name", wr.d.getPackageName());
        intent.putExtra("badge_count_class_name", wr.d.getClassName());
        g0.h3(new s(intent, 4));
    }

    @Override
    public final List b() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }
}
