package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if ((packageName + ".END_CALL").equals(intent.getAction())) {
            VoIPPreNotificationService.decline(context, 1);
            return;
        }
        if ((packageName + ".DECLINE_CALL").equals(intent.getAction())) {
            VoIPPreNotificationService.decline(context, 4);
            return;
        }
        if ((packageName + ".ANSWER_CALL").equals(intent.getAction())) {
            VoIPPreNotificationService.answer(context);
        }
    }
}
