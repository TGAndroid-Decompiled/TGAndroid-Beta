package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

public class NotificationRepeat extends IntentService {
    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            if (UserConfig.isValidAccount(intExtra)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        NotificationRepeat.lambda$onHandleIntent$0(intExtra);
                    }
                });
            }
        }
    }

    public static void lambda$onHandleIntent$0(int i) {
        NotificationsController.getInstance(i).repeatNotificationMaybe();
    }
}
