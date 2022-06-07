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
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (!TextUtils.isEmpty(stringExtra) && !stringExtra.contains("_ia_")) {
                String[] split = stringExtra.split("_");
                if (split.length >= 3) {
                    ApplicationLoader.postInitApplication();
                    int intValue = Utilities.parseInt((CharSequence) split[0]).intValue();
                    if (intValue >= 0 && intValue < 4) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                        }
                        if (SystemClock.elapsedRealtime() - AccountInstance.getInstance(intValue).getNotificationsController().lastNotificationChannelCreateTime > 1000) {
                            SharedPreferences notificationsSettings = AccountInstance.getInstance(intValue).getNotificationsSettings();
                            boolean startsWith = split[1].startsWith("channel");
                            int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (startsWith) {
                                if (stringExtra.equals(notificationsSettings.getString("channels", null))) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("apply channel " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit = notificationsSettings.edit();
                                    String globalNotificationsKey = NotificationsController.getGlobalNotificationsKey(2);
                                    if (booleanExtra) {
                                        i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    }
                                    edit.putInt(globalNotificationsKey, i).commit();
                                    AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(2);
                                } else {
                                    return;
                                }
                            } else if (split[1].startsWith("groups")) {
                                if (stringExtra.equals(notificationsSettings.getString("groups", null))) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("apply channel " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                                    String globalNotificationsKey2 = NotificationsController.getGlobalNotificationsKey(0);
                                    if (!booleanExtra) {
                                        i2 = 0;
                                    }
                                    edit2.putInt(globalNotificationsKey2, i2).commit();
                                    AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(0);
                                } else {
                                    return;
                                }
                            } else if (!split[1].startsWith("private")) {
                                long longValue = Utilities.parseLong(split[1]).longValue();
                                if (longValue != 0) {
                                    if (stringExtra.equals(notificationsSettings.getString("org.telegram.key" + longValue, null))) {
                                        if (BuildVars.LOGS_ENABLED) {
                                            FileLog.d("apply channel " + stringExtra + " state");
                                        }
                                        SharedPreferences.Editor edit3 = notificationsSettings.edit();
                                        String str = "notify2_" + longValue;
                                        if (booleanExtra) {
                                            i = 2;
                                        }
                                        edit3.putInt(str, i);
                                        if (!booleanExtra) {
                                            edit3.remove("notifyuntil_" + longValue);
                                        }
                                        edit3.commit();
                                        AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(longValue, true);
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else if (stringExtra.equals(notificationsSettings.getString("private", null))) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("apply channel " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit4 = notificationsSettings.edit();
                                String globalNotificationsKey3 = NotificationsController.getGlobalNotificationsKey(1);
                                if (booleanExtra) {
                                    i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                edit4.putInt(globalNotificationsKey3, i).commit();
                                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(1);
                            } else {
                                return;
                            }
                            AccountInstance.getInstance(intValue).getConnectionsManager().resumeNetworkMaybe();
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("received disable notification event right after creating notification channel, ignoring");
                        }
                    }
                }
            }
        }
    }
}
