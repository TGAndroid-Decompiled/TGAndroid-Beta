package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        if (UserConfig.isValidAccount(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (longExtra == 0) {
                MessagesController.getNotificationsSettings(intExtra).edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(intExtra).edit();
            edit.putInt("dismissDate" + longExtra, intExtra2).commit();
        }
    }
}
