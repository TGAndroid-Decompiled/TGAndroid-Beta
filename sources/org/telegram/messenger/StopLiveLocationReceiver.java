package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class StopLiveLocationReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        for (int i7 = 0; i7 < 4; i7++) {
            Utilities.d.c(new jd(sd.f(i7), 6));
        }
    }
}
