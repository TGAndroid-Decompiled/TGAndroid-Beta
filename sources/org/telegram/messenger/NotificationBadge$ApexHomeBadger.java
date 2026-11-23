package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements xr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", as.d.getPackageName());
        intent.putExtra("count", i7);
        intent.putExtra("class", as.d.getClassName());
        if (as.a(intent)) {
            g0.g3(new s(intent, 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
