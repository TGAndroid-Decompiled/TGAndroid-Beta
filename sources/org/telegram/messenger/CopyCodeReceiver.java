package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class CopyCodeReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        gl.g(intent.getStringExtra("text"));
    }
}
