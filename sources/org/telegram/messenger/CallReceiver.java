package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
public class CallReceiver extends BroadcastReceiver {
    public static final int a = 0;

    public static void a() {
        String str = null;
        String string = xea.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - xea.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            jn7.e().k(jn7.k4, str);
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String h = f78.h(intent.getStringExtra("incoming_number"), false);
            xea.q().edit().putString("last_call_phone_number", h).putLong("last_call_time", System.currentTimeMillis()).apply();
            jn7.e().k(jn7.k4, h);
        }
    }
}
