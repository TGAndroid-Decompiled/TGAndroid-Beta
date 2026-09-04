package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
            if (!UserConfig.isValidAccount(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                NotificationsController.getInstance(intExtra).processIgnoreStories();
            } else if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                NotificationsController.getInstance(intExtra).processIgnoreStoryReactions();
            } else if (longExtra == 0) {
                FileLog.d("set dismissDate of global to " + intExtra2);
                MessagesController.getNotificationsSettings(intExtra).edit().putInt("dismissDate", intExtra2).commit();
            } else {
                FileLog.d("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(intExtra).edit();
                StringBuilder sb2 = new StringBuilder("dismissDate");
                sb2.append(longExtra);
                edit.putInt(sb2.toString(), intExtra2).commit();
            }
        }
    }
}
