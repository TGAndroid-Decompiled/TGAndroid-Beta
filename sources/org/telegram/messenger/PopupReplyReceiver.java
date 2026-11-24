package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (!y6c.q(intExtra)) {
                return;
            }
            im7.l0.c(new wl7(im7.n(intExtra), (byte) 0));
        }
    }
}
