package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AppStartReceiver extends BroadcastReceiver {
    public static final int f14355a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            i0.g3(new ag.f3(9));
        }
    }
}
