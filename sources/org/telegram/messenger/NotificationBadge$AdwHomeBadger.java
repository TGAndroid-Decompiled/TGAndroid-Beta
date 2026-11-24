package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", ak7.d.getPackageName());
        intent.putExtra("CNAME", ak7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (ak7.a(intent)) {
            gl.c3(new hk(intent, (byte) 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
