package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements bm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", dm7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", dm7.d.getClassName());
        if (dm7.a(intent)) {
            gm.c3(new hl(intent, (byte) 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
