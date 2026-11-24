package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
public class CallReceiver extends BroadcastReceiver {
    public static final int a = 0;

    public static void a() {
        String str = null;
        String string = gba.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - gba.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            kk7.e().k(kk7.j4, str);
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String h = p38.h(intent.getStringExtra("incoming_number"), false);
            gba.q().edit().putString("last_call_phone_number", h).putLong("last_call_time", System.currentTimeMillis()).apply();
            kk7.e().k(kk7.j4, h);
        }
    }
}
