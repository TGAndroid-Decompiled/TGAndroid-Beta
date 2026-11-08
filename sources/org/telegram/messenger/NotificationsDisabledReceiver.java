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
            int i7 = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (!TextUtils.isEmpty(stringExtra) && !stringExtra.contains("_ia_")) {
                String[] split = stringExtra.split("_");
                if (split.length >= 3) {
                    t0.w();
                    int intValue = Utilities.z(split[0]).intValue();
                    if (intValue >= 0 && intValue < 4) {
                        if (r2.f25212a) {
                            a8.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                        }
                        if (SystemClock.elapsedRealtime() - dt.t(c.a(intValue).f21765a).O <= 1000) {
                            if (r2.f25212a) {
                                a8.b("received disable notification event right after creating notification channel, ignoring");
                                return;
                            }
                            return;
                        }
                        SharedPreferences c10 = c.a(intValue).c();
                        int i10 = Integer.MAX_VALUE;
                        if (split[1].startsWith("channel")) {
                            if (stringExtra.equals(c10.getString("channels", null))) {
                                if (r2.f25212a) {
                                    a8.b("apply channel{channel} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit = c10.edit();
                                String q10 = dt.q(2);
                                if (booleanExtra) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                edit.putInt(q10, i7).commit();
                                dt.t(c.a(intValue).f21765a).b0(2);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("groups")) {
                            if (stringExtra.equals(c10.getString("groups", null))) {
                                if (r2.f25212a) {
                                    a8.b("apply channel{groups} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit2 = c10.edit();
                                String q11 = dt.q(0);
                                if (!booleanExtra) {
                                    i10 = 0;
                                }
                                edit2.putInt(q11, i10).commit();
                                dt.t(c.a(intValue).f21765a).b0(0);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("private")) {
                            if (stringExtra.equals(c10.getString("private", null))) {
                                if (r2.f25212a) {
                                    a8.b("apply channel{private} " + stringExtra + " state");
                                }
                                SharedPreferences.Editor edit3 = c10.edit();
                                String q12 = dt.q(1);
                                if (booleanExtra) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                edit3.putInt(q12, i7).commit();
                                dt.t(c.a(intValue).f21765a).b0(1);
                            } else {
                                return;
                            }
                        } else if (split[1].startsWith("stories")) {
                            if (stringExtra.equals(c10.getString("stories", null))) {
                                if (r2.f25212a) {
                                    a8.b("apply channel{stories} " + stringExtra + " state");
                                }
                                c10.edit().putBoolean(dt.q(3), !booleanExtra).commit();
                                dt.t(c.a(intValue).f21765a).b0(1);
                            } else {
                                return;
                            }
                        } else {
                            long longValue = Utilities.A(split[1]).longValue();
                            if (longValue != 0) {
                                String v = dt.v(longValue, 0, false);
                                if (stringExtra.equals(c10.getString("org.telegram.key" + longValue, null))) {
                                    if (r2.f25212a) {
                                        a8.b("apply channel{else} " + stringExtra + " state");
                                    }
                                    SharedPreferences.Editor edit4 = c10.edit();
                                    String i11 = rf.b.i("notify2_", v);
                                    if (booleanExtra) {
                                        i7 = 2;
                                    }
                                    edit4.putInt(i11, i7);
                                    if (!booleanExtra) {
                                        edit4.remove("notifyuntil_" + v);
                                    }
                                    edit4.commit();
                                    dt.t(c.a(intValue).f21765a).c0(longValue, 0L, true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        ConnectionsManager.getInstance(c.a(intValue).f21765a).resumeNetworkMaybe();
                    }
                }
            }
        }
    }
}
