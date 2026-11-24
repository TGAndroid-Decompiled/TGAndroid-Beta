package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements bm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", dm7.d.getPackageName());
        intent.putExtra("CNAME", dm7.d.getClassName());
        intent.putExtra("COUNT", i);
        if (dm7.a(intent)) {
            gm.c3(new hl(intent, (byte) 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
