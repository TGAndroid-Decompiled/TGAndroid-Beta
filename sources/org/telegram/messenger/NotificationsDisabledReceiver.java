package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;
public class NotificationsDisabledReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (!TextUtils.isEmpty(stringExtra) && !stringExtra.contains("_ia_")) {
                String[] split = stringExtra.split("_");
                if (split.length >= 3) {
                    a.v();
                    int intValue = Utilities.z(split[0]).intValue();
                    if (intValue >= 0 && intValue < 4) {
                        if (e21.a) {
                            fc4.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                        }
                        if (SystemClock.elapsedRealtime() - lo7.n(j5.a(intValue).a).P <= 1000) {
                            if (e21.a) {
                                fc4.b("received disable notification event right after creating notification channel, ignoring");
                                return;
                            }
                            return;
                        }
                        SharedPreferences d = j5.a(intValue).d();
                        int i2 = Integer.MAX_VALUE;
                        if (split[1].startsWith("channel")) {
                            if (stringExtra.equals(d.getString("channels", null))) {
                                if (e21.a) {
                                    fc4.b("apply channel{channel} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit = d.edit();
                                String k = lo7.k(2);
                                if (booleanExtra) {
                                    i = Integer.MAX_VALUE;
                                }
                                edit.putInt(k, i).commit();
                                lo7.n(j5.a(intValue).a).b0(2);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("groups")) {
                            if (stringExtra.equals(d.getString("groups", null))) {
                                if (e21.a) {
                                    fc4.b("apply channel{groups} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit2 = d.edit();
                                String k2 = lo7.k(0);
                                if (!booleanExtra) {
                                    i2 = 0;
                                }
                                edit2.putInt(k2, i2).commit();
                                lo7.n(j5.a(intValue).a).b0(0);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("private")) {
                            if (stringExtra.equals(d.getString("private", null))) {
                                if (e21.a) {
                                    fc4.b("apply channel{private} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit3 = d.edit();
                                String k3 = lo7.k(1);
                                if (booleanExtra) {
                                    i = Integer.MAX_VALUE;
                                }
                                edit3.putInt(k3, i).commit();
                                lo7.n(j5.a(intValue).a).b0(1);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("stories")) {
                            if (stringExtra.equals(d.getString("stories", null))) {
                                if (e21.a) {
                                    fc4.b("apply channel{stories} " + stringExtra + " state");
                                }
                                d.edit().putBoolean(lo7.k(3), !booleanExtra).commit();
                                lo7.n(j5.a(intValue).a).b0(1);
                            } else {
                                return;
                            }
                        } else {
                            long longValue = Utilities.A(split[1]).longValue();
                            if (longValue != 0) {
                                String p = lo7.p(longValue, 0L, false);
                                if (stringExtra.equals(d.getString("org.telegram.key" + longValue, null))) {
                                    if (e21.a) {
                                        fc4.b("apply channel{else} " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit4 = d.edit();
                                    String h = b10.h("notify2_", p);
                                    if (booleanExtra) {
                                        i = 2;
                                    }
                                    edit4.putInt(h, i);
                                    if (!booleanExtra) {
                                        edit4.remove("notifyuntil_" + p);
                                    }
                                    edit4.commit();
                                    lo7.n(j5.a(intValue).a).c0(longValue, 0L, true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        ConnectionsManager.getInstance(j5.a(intValue).a).resumeNetworkMaybe();
                    }
                }
            }
        }
    }
}
