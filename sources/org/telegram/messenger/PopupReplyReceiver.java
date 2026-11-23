package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", k10.f24932t0);
            if (!k10.r(intExtra)) {
                return;
            }
            ys.f28133l0.c(new ms(ys.t(intExtra), 0));
        }
    }
}
