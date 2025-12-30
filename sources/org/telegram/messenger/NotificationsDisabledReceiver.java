package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;

public class NotificationsDisabledReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (TextUtils.isEmpty(stringExtra) || stringExtra.contains("_ia_")) {
                return;
            }
            String[] strArrSplit = stringExtra.split("_");
            if (strArrSplit.length < 3) {
                return;
            }
            ApplicationLoader.postInitApplication();
            int iIntValue = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
            if (iIntValue < 0 || iIntValue >= 4) {
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
            }
            if (SystemClock.elapsedRealtime() - AccountInstance.getInstance(iIntValue).getNotificationsController().lastNotificationChannelCreateTime <= 1000) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("received disable notification event right after creating notification channel, ignoring");
                    return;
                }
                return;
            }
            SharedPreferences notificationsSettings = AccountInstance.getInstance(iIntValue).getNotificationsSettings();
            if (strArrSplit[1].startsWith("channel")) {
                if (!stringExtra.equals(notificationsSettings.getString("channels", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{channel} " + stringExtra + " state");
                }
                notificationsSettings.edit().putInt(NotificationsController.getGlobalNotificationsKey(2), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                AccountInstance.getInstance(iIntValue).getNotificationsController().updateServerNotificationsSettings(2);
            } else if (strArrSplit[1].startsWith("groups")) {
                if (!stringExtra.equals(notificationsSettings.getString("groups", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{groups} " + stringExtra + " state");
                }
                notificationsSettings.edit().putInt(NotificationsController.getGlobalNotificationsKey(0), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                AccountInstance.getInstance(iIntValue).getNotificationsController().updateServerNotificationsSettings(0);
            } else if (strArrSplit[1].startsWith("private")) {
                if (!stringExtra.equals(notificationsSettings.getString("private", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{private} " + stringExtra + " state");
                }
                notificationsSettings.edit().putInt(NotificationsController.getGlobalNotificationsKey(1), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                AccountInstance.getInstance(iIntValue).getNotificationsController().updateServerNotificationsSettings(1);
            } else if (strArrSplit[1].startsWith("stories")) {
                if (!stringExtra.equals(notificationsSettings.getString("stories", null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{stories} " + stringExtra + " state");
                }
                notificationsSettings.edit().putBoolean(NotificationsController.getGlobalNotificationsKey(3), !booleanExtra).commit();
                AccountInstance.getInstance(iIntValue).getNotificationsController().updateServerNotificationsSettings(1);
            } else {
                long jLongValue = Utilities.parseLong(strArrSplit[1]).longValue();
                if (jLongValue == 0) {
                    return;
                }
                String sharedPrefKey = NotificationsController.getSharedPrefKey(jLongValue, 0);
                if (!stringExtra.equals(notificationsSettings.getString("org.telegram.key" + jLongValue, null))) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("apply channel{else} " + stringExtra + " state");
                }
                SharedPreferences.Editor editorEdit = notificationsSettings.edit();
                editorEdit.putInt("notify2_" + sharedPrefKey, booleanExtra ? 2 : 0);
                if (!booleanExtra) {
                    editorEdit.remove("notifyuntil_" + sharedPrefKey);
                }
                editorEdit.commit();
                AccountInstance.getInstance(iIntValue).getNotificationsController().updateServerNotificationsSettings(jLongValue, 0L, true);
            }
            AccountInstance.getInstance(iIntValue).getConnectionsManager().resumeNetworkMaybe();
        }
    }
}
