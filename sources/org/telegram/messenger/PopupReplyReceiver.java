package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", p10.f24470s0);
            if (!p10.r(intExtra)) {
                return;
            }
            dt.f22076k0.c(new rs(dt.t(intExtra), 0));
        }
    }
}
