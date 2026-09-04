package org.telegram.messenger.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.ui.Cells.p6;
public class VoIPActionsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("group_call_invite_msg_id") && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().handleNotificationAction(intent);
            return;
        }
        String packageName = context.getPackageName();
        if (p6.t(packageName, ".END_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.decline(context, 1);
            }
        } else if (p6.t(packageName, ".DECLINE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.decline(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.decline(context, 4);
            }
        } else if (p6.t(packageName, ".ANSWER_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.answer(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.answer(context);
            }
        } else if (p6.t(packageName, ".HIDE_CALL").equals(intent.getAction())) {
            if (intent.hasExtra("group_call_invite_msg_id")) {
                VoIPGroupNotification.hide(context, intent.getIntExtra("currentAccount", 0), intent.getIntExtra("group_call_invite_msg_id", 0));
            } else {
                VoIPPreNotificationService.dismiss(context, false);
            }
        }
    }
}
