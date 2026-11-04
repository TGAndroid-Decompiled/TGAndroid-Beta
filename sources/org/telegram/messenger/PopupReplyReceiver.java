package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", h10.f22829t0);
            if (!h10.r(intExtra)) {
                return;
            }
            us.f25748l0.c(new is(us.t(intExtra), 0));
        }
    }
}
