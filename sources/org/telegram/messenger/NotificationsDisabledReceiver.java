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
            int i10 = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (!TextUtils.isEmpty(stringExtra) && !stringExtra.contains("_ia_")) {
                String[] split = stringExtra.split("_");
                if (split.length >= 3) {
                    w0.w();
                    int intValue = Utilities.z(split[0]).intValue();
                    if (intValue >= 0 && intValue < 4) {
                        if (v2.f18578a) {
                            f8.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                        }
                        if (SystemClock.elapsedRealtime() - pt.t(c.a(intValue).f15043a).O <= 1000) {
                            if (v2.f18578a) {
                                f8.b("received disable notification event right after creating notification channel, ignoring");
                                return;
                            }
                            return;
                        }
                        SharedPreferences c10 = c.a(intValue).c();
                        int i11 = Integer.MAX_VALUE;
                        if (split[1].startsWith("channel")) {
                            if (stringExtra.equals(c10.getString("channels", null))) {
                                if (v2.f18578a) {
                                    f8.b("apply channel{channel} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit = c10.edit();
                                String q6 = pt.q(2);
                                if (booleanExtra) {
                                    i10 = Integer.MAX_VALUE;
                                }
                                edit.putInt(q6, i10).commit();
                                pt.t(c.a(intValue).f15043a).b0(2);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("groups")) {
                            if (stringExtra.equals(c10.getString("groups", null))) {
                                if (v2.f18578a) {
                                    f8.b("apply channel{groups} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit2 = c10.edit();
                                String q10 = pt.q(0);
                                if (!booleanExtra) {
                                    i11 = 0;
                                }
                                edit2.putInt(q10, i11).commit();
                                pt.t(c.a(intValue).f15043a).b0(0);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("private")) {
                            if (stringExtra.equals(c10.getString("private", null))) {
                                if (v2.f18578a) {
                                    f8.b("apply channel{private} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit3 = c10.edit();
                                String q11 = pt.q(1);
                                if (booleanExtra) {
                                    i10 = Integer.MAX_VALUE;
                                }
                                edit3.putInt(q11, i10).commit();
                                pt.t(c.a(intValue).f15043a).b0(1);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("stories")) {
                            if (stringExtra.equals(c10.getString("stories", null))) {
                                if (v2.f18578a) {
                                    f8.b("apply channel{stories} " + stringExtra + " state");
                                }
                                c10.edit().putBoolean(pt.q(3), !booleanExtra).commit();
                                pt.t(c.a(intValue).f15043a).b0(1);
                            } else {
                                return;
                            }
                        } else {
                            long longValue = Utilities.A(split[1]).longValue();
                            if (longValue != 0) {
                                String v = pt.v(longValue, 0, false);
                                if (stringExtra.equals(c10.getString("org.telegram.key" + longValue, null))) {
                                    if (v2.f18578a) {
                                        f8.b("apply channel{else} " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit4 = c10.edit();
                                    String h = sc.e.h("notify2_", v);
                                    if (booleanExtra) {
                                        i10 = 2;
                                    }
                                    edit4.putInt(h, i10);
                                    if (!booleanExtra) {
                                        edit4.remove("notifyuntil_" + v);
                                    }
                                    edit4.commit();
                                    pt.t(c.a(intValue).f15043a).c0(longValue, 0L, true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        ConnectionsManager.getInstance(c.a(intValue).f15043a).resumeNetworkMaybe();
                    }
                }
            }
        }
    }
}
