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
            int i10 = 0;
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
                        if (SystemClock.elapsedRealtime() - AccountInstance.getInstance(intValue).getNotificationsController().lastNotificationChannelCreateTime <= 1000) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("received disable notification event right after creating notification channel, ignoring");
                                return;
                            }
                            return;
                        }
                        SharedPreferences notificationsSettings = AccountInstance.getInstance(intValue).getNotificationsSettings();
                        int i11 = Integer.MAX_VALUE;
                        if (split[1].startsWith("channel")) {
                            if (stringExtra.equals(notificationsSettings.getString("channels", null))) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("apply channel{channel} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit = notificationsSettings.edit();
                                String globalNotificationsKey = NotificationsController.getGlobalNotificationsKey(2);
                                if (booleanExtra) {
                                    i10 = Integer.MAX_VALUE;
                                }
                                edit.putInt(globalNotificationsKey, i10).commit();
                                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(2);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("groups")) {
                            if (stringExtra.equals(notificationsSettings.getString("groups", null))) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("apply channel{groups} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit2 = notificationsSettings.edit();
                                String globalNotificationsKey2 = NotificationsController.getGlobalNotificationsKey(0);
                                if (!booleanExtra) {
                                    i11 = 0;
                                }
                                edit2.putInt(globalNotificationsKey2, i11).commit();
                                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(0);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("private")) {
                            if (stringExtra.equals(notificationsSettings.getString("private", null))) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("apply channel{private} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit3 = notificationsSettings.edit();
                                String globalNotificationsKey3 = NotificationsController.getGlobalNotificationsKey(1);
                                if (booleanExtra) {
                                    i10 = Integer.MAX_VALUE;
                                }
                                edit3.putInt(globalNotificationsKey3, i10).commit();
                                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(1);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("stories")) {
                            if (stringExtra.equals(notificationsSettings.getString("stories", null))) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("apply channel{stories} " + stringExtra + " state");
                                }
                                notificationsSettings.edit().putBoolean(NotificationsController.getGlobalNotificationsKey(3), !booleanExtra).commit();
                                AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(1);
                            } else {
                                return;
                            }
                        } else {
                            long longValue = Utilities.parseLong(split[1]).longValue();
                            if (longValue != 0) {
                                String sharedPrefKey = NotificationsController.getSharedPrefKey(longValue, 0);
                                if (stringExtra.equals(notificationsSettings.getString("org.telegram.key" + longValue, null))) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("apply channel{else} " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit4 = notificationsSettings.edit();
                                    String e = vh.v2.e("notify2_", sharedPrefKey);
                                    if (booleanExtra) {
                                        i10 = 2;
                                    }
                                    edit4.putInt(e, i10);
                                    if (!booleanExtra) {
                                        edit4.remove("notifyuntil_" + sharedPrefKey);
                                    }
                                    edit4.commit();
                                    AccountInstance.getInstance(intValue).getNotificationsController().updateServerNotificationsSettings(longValue, 0L, true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        AccountInstance.getInstance(intValue).getConnectionsManager().resumeNetworkMaybe();
                    }
                }
            }
        }
    }
}
