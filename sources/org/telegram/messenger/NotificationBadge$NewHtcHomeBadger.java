package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NewHtcHomeBadger implements xm7 {
    @Override
    public final void a(int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", zm7.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", zm7.d.getPackageName());
        intent2.putExtra("count", i);
        if (!zm7.a(intent) && !zm7.a(intent2)) {
            return;
        }
        hl.c3(new pl7(intent, intent2, (byte) 2));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
