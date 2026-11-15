package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements zr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", cs.d.getPackageName());
        intent.putExtra("CNAME", cs.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (cs.a(intent)) {
            g0.h3(new s(intent, 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
