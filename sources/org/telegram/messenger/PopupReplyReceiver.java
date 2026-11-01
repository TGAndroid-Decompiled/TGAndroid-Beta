package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            w0.w();
            int intExtra = intent.getIntExtra("currentAccount", e20.f15506s0);
            if (!e20.r(intExtra)) {
                return;
            }
            pt.f17637k0.c(new bt(pt.t(intExtra), 1));
        }
    }
}
