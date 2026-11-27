package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", yac.t0);
            if (!yac.q(intExtra)) {
                return;
            }
            ip7.l0.c(new vo7(ip7.n(intExtra), (byte) 0));
        }
    }
}
