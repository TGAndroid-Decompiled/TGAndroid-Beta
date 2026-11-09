package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShareBroadcastReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent createChooser = Intent.createChooser(intent2, id.M0(2131745458, null));
            createChooser.setFlags(268435456);
            context.startActivity(createChooser);
        }
    }
}
