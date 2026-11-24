package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (!y6c.q(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            gl.c3(new o57(z3a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, (byte) 17));
        }
    }
}
