package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", h10.f22829t0);
            if (!h10.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                us.f25748l0.c(new is(us.t(intExtra), 10));
            } else if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                us.f25748l0.c(new is(us.t(intExtra), 6));
            } else if (longExtra == 0) {
                a8.b("set dismissDate of global to " + intExtra2);
                hp.s1(intExtra).f22989d7.edit().putInt("dismissDate", intExtra2).commit();
            } else {
                a8.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = hp.s1(intExtra).f22989d7.edit();
                StringBuilder sb2 = new StringBuilder("dismissDate");
                sb2.append(longExtra);
                edit.putInt(sb2.toString(), intExtra2).commit();
            }
        }
    }
}
