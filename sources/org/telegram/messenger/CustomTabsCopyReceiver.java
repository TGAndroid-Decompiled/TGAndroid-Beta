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
            i0.g(dataString);
            Toast.makeText(context, dd.L0(2131748931, null), 0).show();
        }
    }
}
