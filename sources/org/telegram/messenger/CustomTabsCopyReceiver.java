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
            gm.g(dataString);
            Toast.makeText(context, jb6.M0(2131748678, null), 0).show();
        }
    }
}
