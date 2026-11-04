package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements ur {
    @Override
    public final void a(int i3) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", wr.d.getPackageName());
        intent.putExtra("count", i3);
        intent.putExtra("class", wr.d.getClassName());
        if (wr.a(intent)) {
            g0.h3(new s(intent, 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
