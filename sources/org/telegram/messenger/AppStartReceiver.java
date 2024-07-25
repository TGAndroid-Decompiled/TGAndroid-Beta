package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class AppStartReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AppStartReceiver.lambda$onReceive$0();
            }
        });
    }

    public static void lambda$onReceive$0() {
        SharedConfig.loadConfig();
        if (SharedConfig.passcodeHash.length() > 0) {
            SharedConfig.appLocked = true;
            SharedConfig.saveConfig();
        }
        ApplicationLoader.startPushService();
    }
}
