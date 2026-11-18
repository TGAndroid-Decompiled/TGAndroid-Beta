package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements wr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", zr.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", zr.d.getClassName());
        if (zr.a(intent)) {
            g0.g3(new s(intent, 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
