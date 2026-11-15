package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", m10.f24940t0);
            if (!m10.r(intExtra)) {
                return;
            }
            at.f22558l0.c(new os(at.t(intExtra), 0));
        }
    }
}
