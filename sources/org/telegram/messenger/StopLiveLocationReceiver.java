package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class StopLiveLocationReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        for (int i3 = 0; i3 < 4; i3++) {
            Utilities.d.c(new cd(ld.f(i3), 6));
        }
    }
}
