package org.telegram.messenger;

import android.content.Intent;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$NewHtcHomeBadger implements ls {
    @Override
    public final void a(int i10) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", os.d.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", os.d.getPackageName());
        intent2.putExtra("count", i10);
        if (!os.a(intent) && !os.a(intent2)) {
            return;
        }
        i0.g3(new hr(7, intent, intent2));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.htc.launcher");
    }
}
