package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements wr {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", zr.d.getPackageName());
        intent.putExtra("CNAME", zr.d.getClassName());
        intent.putExtra("COUNT", i7);
        if (zr.a(intent)) {
            g0.g3(new s(intent, 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
