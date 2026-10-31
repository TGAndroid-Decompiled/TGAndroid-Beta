package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$AdwHomeBadger implements ls {
    @Override
    public final void a(int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", os.d.getPackageName());
        intent.putExtra("CNAME", os.d.getClassName());
        intent.putExtra("COUNT", i10);
        if (os.a(intent)) {
            i0.g3(new t(intent, 1));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
