package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", m10.f24934t0);
            if (!m10.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                at.f22558l0.c(new os(at.t(intExtra), 10));
            } else if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                at.f22558l0.c(new os(at.t(intExtra), 6));
            } else if (longExtra == 0) {
                a8.b("set dismissDate of global to " + intExtra2);
                np.s1(intExtra).f25270e7.edit().putInt("dismissDate", intExtra2).commit();
            } else {
                a8.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = np.s1(intExtra).f25270e7.edit();
                StringBuilder sb2 = new StringBuilder("dismissDate");
                sb2.append(longExtra);
                edit.putInt(sb2.toString(), intExtra2).commit();
            }
        }
    }
}
