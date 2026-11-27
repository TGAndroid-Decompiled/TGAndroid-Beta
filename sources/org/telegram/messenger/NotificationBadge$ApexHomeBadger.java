package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements xm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", zm7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", zm7.d.getClassName());
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
