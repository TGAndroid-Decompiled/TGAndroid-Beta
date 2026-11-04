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
            int i3 = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (!TextUtils.isEmpty(stringExtra) && !stringExtra.contains("_ia_")) {
                String[] split = stringExtra.split("_");
                if (split.length >= 3) {
                    t0.w();
                    int intValue = Utilities.z(split[0]).intValue();
                    if (intValue >= 0 && intValue < 4) {
                        if (r2.f25040a) {
                            a8.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                        }
                        if (SystemClock.elapsedRealtime() - us.t(c.a(intValue).f21919a).P <= 1000) {
                            if (r2.f25040a) {
                                a8.b("received disable notification event right after creating notification channel, ignoring");
                                return;
                            }
                            return;
                        }
                        SharedPreferences c2 = c.a(intValue).c();
                        int i10 = Integer.MAX_VALUE;
                        if (split[1].startsWith("channel")) {
                            if (stringExtra.equals(c2.getString("channels", null))) {
                                if (r2.f25040a) {
                                    a8.b("apply channel{channel} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit = c2.edit();
                                String q10 = us.q(2);
                                if (booleanExtra) {
                                    i3 = Integer.MAX_VALUE;
                                }
                                edit.putInt(q10, i3).commit();
                                us.t(c.a(intValue).f21919a).b0(2);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("groups")) {
                            if (stringExtra.equals(c2.getString("groups", null))) {
                                if (r2.f25040a) {
                                    a8.b("apply channel{groups} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit2 = c2.edit();
                                String q11 = us.q(0);
                                if (!booleanExtra) {
                                    i10 = 0;
                                }
                                edit2.putInt(q11, i10).commit();
                                us.t(c.a(intValue).f21919a).b0(0);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("private")) {
                            if (stringExtra.equals(c2.getString("private", null))) {
                                if (r2.f25040a) {
                                    a8.b("apply channel{private} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit3 = c2.edit();
                                String q12 = us.q(1);
                                if (booleanExtra) {
                                    i3 = Integer.MAX_VALUE;
                                }
                                edit3.putInt(q12, i3).commit();
                                us.t(c.a(intValue).f21919a).b0(1);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("stories")) {
                            if (stringExtra.equals(c2.getString("stories", null))) {
                                if (r2.f25040a) {
                                    a8.b("apply channel{stories} " + stringExtra + " state");
                                }
                                c2.edit().putBoolean(us.q(3), !booleanExtra).commit();
                                us.t(c.a(intValue).f21919a).b0(1);
                            } else {
                                return;
                            }
                        } else {
                            long longValue = Utilities.A(split[1]).longValue();
                            if (longValue != 0) {
                                String v = us.v(longValue, 0, false);
                                if (stringExtra.equals(c2.getString("org.telegram.key" + longValue, null))) {
                                    if (r2.f25040a) {
                                        a8.b("apply channel{else} " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit4 = c2.edit();
                                    String f10 = t4.c.f("notify2_", v);
                                    if (booleanExtra) {
                                        i3 = 2;
                                    }
                                    edit4.putInt(f10, i3);
                                    if (!booleanExtra) {
                                        edit4.remove("notifyuntil_" + v);
                                    }
                                    edit4.commit();
                                    us.t(c.a(intValue).f21919a).c0(longValue, 0L, true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        ConnectionsManager.getInstance(c.a(intValue).f21919a).resumeNetworkMaybe();
                    }
                }
            }
        }
    }
}
