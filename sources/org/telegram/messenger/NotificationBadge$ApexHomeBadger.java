package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$ApexHomeBadger implements ls {
    @Override
    public final void a(int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", os.d.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", os.d.getClassName());
        if (os.a(intent)) {
            i0.g3(new t(intent, 2));
        }
    }

    @Override
    public final List b() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
