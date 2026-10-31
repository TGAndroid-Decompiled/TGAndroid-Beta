package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", d20.f15147s0);
            if (!d20.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                ot.f17304k0.c(new at(ot.t(intExtra), 11));
            } else if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                ot.f17304k0.c(new at(ot.t(intExtra), 8));
            } else if (longExtra == 0) {
                f8.b("set dismissDate of global to " + intExtra2);
                vp.r1(intExtra).e7.edit().putInt("dismissDate", intExtra2).commit();
            } else {
                f8.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = vp.r1(intExtra).e7.edit();
                StringBuilder sb2 = new StringBuilder("dismissDate");
                sb2.append(longExtra);
                edit.putInt(sb2.toString(), intExtra2).commit();
            }
        }
    }
}
