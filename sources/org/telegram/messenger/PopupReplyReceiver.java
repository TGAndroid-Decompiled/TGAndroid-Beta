package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", j10.f24773t0);
            if (!j10.r(intExtra)) {
                return;
            }
            xs.f27959l0.c(new ls(xs.t(intExtra), 0));
        }
    }
}
