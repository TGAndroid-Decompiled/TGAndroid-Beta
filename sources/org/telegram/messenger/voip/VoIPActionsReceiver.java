package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("group_call_invite_msg_id") && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if (s3.c.l(packageName, ".END_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.decline(context, 1);
                return;
            }
        }
        if (s3.c.l(packageName, ".DECLINE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.decline(context, 4);
                return;
            }
        }
        if (s3.c.l(packageName, ".ANSWER_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.answer(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.answer(context);
                return;
            }
        }
        if (s3.c.l(packageName, ".HIDE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.hide(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.dismiss(context, false);
            }
        }
    }
}
