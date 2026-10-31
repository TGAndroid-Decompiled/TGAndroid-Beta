package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class StopLiveLocationReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        for (int i10 = 0; i10 < 4; i10++) {
            Utilities.d.c(new ed(nd.f(i10), 6));
        }
    }
}
