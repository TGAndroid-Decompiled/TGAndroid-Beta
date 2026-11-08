package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", p10.f24470s0);
            if (!p10.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                dt.f22076k0.c(new rs(dt.t(intExtra), 10));
            } else if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                dt.f22076k0.c(new rs(dt.t(intExtra), 6));
            } else if (longExtra == 0) {
                a8.b("set dismissDate of global to " + intExtra2);
                qp.s1(intExtra).f24764d7.edit().putInt("dismissDate", intExtra2).commit();
            } else {
                a8.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = qp.s1(intExtra).f24764d7.edit();
                StringBuilder sb2 = new StringBuilder("dismissDate");
                sb2.append(longExtra);
                edit.putInt(sb2.toString(), intExtra2).commit();
            }
        }
    }
}
