package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class StopLiveLocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        for (int i9 = 0; i9 < 4; i9++) {
            LocationController.getInstance(i9).removeAllLocationSharings();
        }
    }
}
