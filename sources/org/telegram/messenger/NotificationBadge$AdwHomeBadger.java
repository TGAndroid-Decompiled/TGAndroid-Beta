package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements ur {
    @Override
    public final void a(int i3) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", wr.d.getPackageName());
        intent.putExtra("CNAME", wr.d.getClassName());
        intent.putExtra("COUNT", i3);
        if (wr.a(intent)) {
            g0.h3(new s(intent, 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
