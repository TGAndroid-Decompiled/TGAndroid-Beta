package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (!z8c.q(intExtra)) {
                return;
            }
            lo7.l0.c(new zn7(lo7.n(intExtra), (byte) 0));
        }
    }
}
