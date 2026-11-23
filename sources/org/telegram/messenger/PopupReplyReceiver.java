package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", i10.f24637t0);
            if (!i10.r(intExtra)) {
                return;
            }
            xs.f28073l0.c(new ls(xs.t(intExtra), 0));
        }
    }
}
