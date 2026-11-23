package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import bi.j5;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.LaunchActivity;
public abstract class c4 {
    public static void a(int i7, long j3, org.telegram.ui.web.o oVar) {
        TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(j3));
        TLRPC.UserFull d2 = np.u1(i7).d2(j3);
        if (d2 == null) {
            np.u1(i7).c3(c22, 0, true, new j5(oVar, i7, c22, 1));
        } else {
            b(i7, c22, d2, oVar);
        }
    }

    public static void b(final int i7, final TLRPC.User user, final TLRPC.UserFull userFull, final org.telegram.ui.web.o oVar) {
        if (userFull.bot_can_manage_emoji_status) {
            oVar.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = org.telegram.messenger.g0.W(LaunchActivity.H1);
        if (W == null) {
            W = org.telegram.messenger.t0.f26895b;
        }
        final Context context = W;
        TLRPC.User f10 = k10.i(i7).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, null);
        b4 b4Var = new b4(f10);
        int i10 = m6.L5;
        int x02 = m6.x0(null, i10, false);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.f29983c0 = b4Var;
        t1Var.f29985d0 = x02;
        t1Var.f29988e0 = -1;
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.f28743a.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753085, p10.q(user), p10.q(user)));
        alertDialog$Builder.k(hd.N0(2131753087, null), new org.telegram.ui.ActionBar.q1() {
            @Override
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                int i12 = i7;
                boolean q10 = k10.i(i12).q();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                org.telegram.ui.web.o oVar2 = oVar;
                if (!q10) {
                    new ug.y0(new org.telegram.ui.ActionBar.g2(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        oVar2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                c4.e(context, i12, user2.f28547id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = np.u1(i12).s1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i12).sendRequest(toggleuseremojistatuspermission, new bi.q1(zArr4, oVar2, userFull));
            }
        });
        alertDialog$Builder.h(hd.N0(2131753086, null), null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
        t1Var2.show();
        t1Var2.setOnDismissListener(new x3(zArr2, zArr, context, i7, user, oVar));
    }

    public static void c() {
        Context context = org.telegram.messenger.t0.f26895b;
        if (context != null) {
            for (int i7 = 0; i7 < 4; i7++) {
                context.getSharedPreferences("botemojistatus_" + i7, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i7, long j3) {
        if (activity == null) {
            return false;
        }
        return org.telegram.messenger.f3.w("requested_", j3, activity.getSharedPreferences("botemojistatus_" + i7, 0), false);
    }

    public static void e(Context context, int i7, long j3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i7, 0).edit();
        edit.putBoolean("requested_" + j3, true).apply();
    }

    public static void f(final int i7, final TLRPC.User user, long j3, final int i10, final org.telegram.ui.web.o oVar) {
        TLRPC.Document e10 = p5.e(i7, j3);
        if (e10 != null) {
            g(i7, user, e10, i10, new t3(oVar, e10, 1));
        } else {
            p5.g(i7).b(j3, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    org.telegram.messenger.g0.g3(new jg.o1(i7, user, document, i10, oVar));
                }
            });
        }
    }

    public static void g(int i7, TLRPC.User user, TLRPC.Document document, int i10, y10 y10Var) {
        SpannableStringBuilder W2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            y10Var.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = org.telegram.messenger.g0.W(LaunchActivity.H1);
        if (W == null) {
            W = org.telegram.messenger.t0.f26895b;
        }
        ConnectionsManager.getInstance(i7).getCurrentTime();
        TLRPC.User f10 = k10.i(i7).f();
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        if (i10 > 0) {
            int i11 = i10 / 86400;
            int i12 = i10 - (86400 * i11);
            int i13 = i12 / 3600;
            int round = Math.round((i12 - (i13 * 3600)) / 60.0f);
            StringBuilder sb2 = new StringBuilder();
            if (i11 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(hd.G(i11, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i13 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(hd.G(i13, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(hd.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753082, p10.q(user), sb2));
        } else {
            W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131753083, p10.q(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, W, null);
        b4 b4Var = new b4(f10, document);
        int i14 = m6.L5;
        int x02 = m6.x0(null, i14, false);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.f29983c0 = b4Var;
        t1Var.f29985d0 = x02;
        t1Var.f29988e0 = -1;
        alertDialog$Builder.n(i14, null);
        alertDialog$Builder.f28743a.U = W2;
        alertDialog$Builder.k(hd.N0(2131753088, null), new v3(i7, zArr2, document, i10, zArr, y10Var));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
        t1Var2.show();
        t1Var2.setOnDismissListener(new bi.k(zArr2, zArr, y10Var, 3));
    }
}
