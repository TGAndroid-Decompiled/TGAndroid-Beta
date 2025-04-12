package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int i;
        if (!intent.hasExtra("group_call_invite_msg_id") && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if ((packageName + ".END_CALL").equals(intent.getAction())) {
            if (!intent.hasExtra("group_call_invite_msg_id")) {
                i = 1;
                VoIPPreNotificationService.decline(context, i);
                return;
            }
            VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            return;
        }
        if ((packageName + ".DECLINE_CALL").equals(intent.getAction())) {
            if (!intent.hasExtra("group_call_invite_msg_id")) {
                i = 4;
                VoIPPreNotificationService.decline(context, i);
                return;
            }
            VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            return;
        }
        if ((packageName + ".ANSWER_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.answer(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
                return;
            } else {
                VoIPPreNotificationService.answer(context);
                return;
            }
        }
        if ((packageName + ".HIDE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.hide(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.dismiss(context, false);
            }
        }
    }
}
