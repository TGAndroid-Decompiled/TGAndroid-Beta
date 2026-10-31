package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            w0.w();
            int intExtra = intent.getIntExtra("currentAccount", d20.f15147s0);
            if (!d20.r(intExtra)) {
                return;
            }
            ot.f17304k0.c(new at(ot.t(intExtra), 1));
        }
    }
}
