package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements xm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", zm7.d.getPackageName());
        intent.putExtra("CNAME", zm7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (zm7.a(intent)) {
            hl.c3(new hk(intent, (byte) 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
