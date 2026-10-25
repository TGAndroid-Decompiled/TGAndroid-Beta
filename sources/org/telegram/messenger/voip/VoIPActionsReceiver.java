package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.ui.Components.b10;
public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("group_call_invite_msg_id") && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if (b10.u(packageName, ".END_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.decline(context, 1);
            }
        } else if (b10.u(packageName, ".DECLINE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.decline(context, 4);
            }
        } else if (b10.u(packageName, ".ANSWER_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.answer(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.answer(context);
            }
        } else if (b10.u(packageName, ".HIDE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.hide(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.dismiss(context, false);
            }
        }
    }
}
