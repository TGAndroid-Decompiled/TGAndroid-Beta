package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements zr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", cs.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", cs.d.getClassName());
        if (cs.a(intent)) {
            g0.h3(new s(intent, 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
