package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShareBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent intentCreateChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
            intentCreateChooser.setFlags(268435456);
            context.startActivity(intentCreateChooser);
        }
    }
}
