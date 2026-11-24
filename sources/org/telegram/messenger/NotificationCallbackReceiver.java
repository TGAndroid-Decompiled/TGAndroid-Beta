package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (!z8c.q(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            gm.c3(new o77(a6a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, (byte) 17));
        }
    }
}
