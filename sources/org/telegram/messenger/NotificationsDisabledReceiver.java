package org.telegram.messenger;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
@TargetApi(28)
public class NotificationsDisabledReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (TextUtils.isEmpty(stringExtra) || stringExtra.contains("_ia_")) {
                return;
            }
            String[] split = stringExtra.split("_");
            if (split.length < 3) {
                return;
            }
            ApplicationLoader.postInitApplication();
            int intValue = Utilities.parseInt((CharSequence) split[0]).intValue();
            if (intValue < 0 || intValue >= 4) {
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
            }
            if (SystemClock.elapsedRealtime() - AccountInstance.getInstance(intValue).getNotificationsController().lastNotificationChannelCreateTime <= 1000) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("received disable notification event right after creating notification channel, ignoring");
                    return;
                }
                return;
            }
            SharedPreferences notificationsSettings = AccountInstance.getInstance(intValue).getNotificationsSettings();
            boolean startsWith = split[1].startsWith("channel");
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (startsWith) {
                if (!stringExtra.equals(notificationsSettings.getString("channels", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{channel} " + stringExtra + " state");
                }
                notificationsSettings.edit().putInt(NotificationsController.getGlobalNotificationsKey(2), booleanExtra ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0).commit();
                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(2);
            } else if (split[1].startsWith("groups")) {
                if (!stringExtra.equals(notificationsSettings.getString("groups", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{groups} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit = notificationsSettings.edit();
                String globalNotificationsKey = NotificationsController.getGlobalNotificationsKey(0);
                if (!booleanExtra) {
                    i = 0;
                }
                edit.putInt(globalNotificationsKey, i).commit();
                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(0);
            } else if (split[1].startsWith("private")) {
                if (!stringExtra.equals(notificationsSettings.getString("private", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{private} " + stringExtra + " state");
                }
                notificationsSettings.edit().putInt(NotificationsController.getGlobalNotificationsKey(1), booleanExtra ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0).commit();
                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(1);
            } else if (split[1].startsWith("stories")) {
                if (!stringExtra.equals(notificationsSettings.getString("stories", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{stories} " + stringExtra + " state");
                }
                notificationsSettings.edit().putBoolean(NotificationsController.getGlobalNotificationsKey(3), !booleanExtra).commit();
                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(1);
            } else {
                long longValue = Utilities.parseLong(split[1]).longValue();
                if (longValue == 0) {
                    return;
                }
                String sharedPrefKey = NotificationsController.getSharedPrefKey(longValue, 0);
                if (!stringExtra.equals(notificationsSettings.getString("org.telegram.key" + longValue, null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{else} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit2 = notificationsSettings.edit();
                edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, booleanExtra ? 2 : 0);
                if (!booleanExtra) {
                    edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL + sharedPrefKey);
                }
                edit2.commit();
                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(longValue, 0, true);
            }
            AccountInstance.getInstance(intValue).getConnectionsManager().resumeNetworkMaybe();
        }
    }
}
