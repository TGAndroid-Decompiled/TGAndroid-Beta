package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NewHtcHomeBadger implements cs {
    @Override
    public final void a(int i7) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", fs.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i7);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", fs.d.getPackageName());
        intent2.putExtra("count", i7);
        if (!fs.a(intent) && !fs.a(intent2)) {
            return;
        }
        g0.h3(new yq(9, intent, intent2));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
