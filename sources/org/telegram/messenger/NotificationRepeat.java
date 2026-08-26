package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda42;

public class NotificationRepeat extends IntentService {
    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    public static void lambda$onHandleIntent$0(int i) {
        NotificationsController.getInstance(i).repeatNotificationMaybe();
    }

    @Override
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        if (UserConfig.isValidAccount(intExtra)) {
            AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda42(intExtra, 3));
        }
    }
}
