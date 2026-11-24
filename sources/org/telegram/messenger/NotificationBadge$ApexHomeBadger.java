package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", ak7.d.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", ak7.d.getClassName());
        if (ak7.a(intent)) {
            gl.c3(new hk(intent, (byte) 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
