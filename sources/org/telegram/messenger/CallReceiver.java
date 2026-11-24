package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
public class CallReceiver extends BroadcastReceiver {
    public static final int a = 0;

    public static void a() {
        String str = null;
        String string = gda.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - gda.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            nm7.e().k(nm7.l4, str);
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String h = r58.h(intent.getStringExtra("incoming_number"), false);
            gda.q().edit().putString("last_call_phone_number", h).putLong("last_call_time", System.currentTimeMillis()).apply();
            nm7.e().k(nm7.l4, h);
        }
    }
}
