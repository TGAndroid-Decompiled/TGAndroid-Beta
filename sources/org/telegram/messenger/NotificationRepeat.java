package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    public static void a(int i10) {
        lambda$onHandleIntent$0(i10);
    }

    public static void lambda$onHandleIntent$0(int i10) {
        NotificationsController.getInstance(i10).repeatNotificationMaybe();
    }

    @Override
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            }
            AndroidUtilities.runOnUIThread(new fi.r2(intExtra, 3));
        }
    }
}
