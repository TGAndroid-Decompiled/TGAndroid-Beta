package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NewHtcHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", ak7.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", ak7.d.getPackageName());
        intent2.putExtra("count", i);
        if (!ak7.a(intent) && !ak7.a(intent2)) {
            return;
        }
        gl.c3(new bj7(intent, intent2, (byte) 4));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
