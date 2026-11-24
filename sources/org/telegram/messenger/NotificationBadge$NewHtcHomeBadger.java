package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NewHtcHomeBadger implements bm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", dm7.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", dm7.d.getPackageName());
        intent2.putExtra("count", i);
        if (!dm7.a(intent) && !dm7.a(intent2)) {
            return;
        }
        gm.c3(new bl7(intent, intent2, (byte) 5));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
