package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    public static void a(int i9) {
        lambda$onHandleIntent$0(i9);
    }

    public static void lambda$onHandleIntent$0(int i9) {
        NotificationsController.getInstance(i9).repeatNotificationMaybe();
    }

    @Override
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new mh.k2(intExtra, 3));
        }
    }
}
