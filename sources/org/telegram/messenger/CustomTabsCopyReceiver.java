package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class CustomTabsCopyReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            gl.g(dataString);
            Toast.makeText(context, k96.M0(2131748729, null), 0).show();
        }
    }
}
