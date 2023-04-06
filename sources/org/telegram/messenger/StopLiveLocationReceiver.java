package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class StopLiveLocationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        for (int i = 0; i < 4; i++) {
            LocationController.getInstance(i).removeAllLocationSharings();
        }
    }
}
