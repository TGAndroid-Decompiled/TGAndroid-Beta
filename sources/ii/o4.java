package ii;

import ai.r6;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.LaunchActivity;
public abstract class o4 {
    public static void a(int i3, long j10, org.telegram.ui.web.p pVar) {
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
        TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
        if (b22 == null) {
            hp.s1(i3).W2(a22, 0, true, new ai.g3(pVar, i3, a22, 1));
        } else {
            b(i3, a22, b22, pVar);
        }
    }

    public static void b(final int i3, final TLRPC.User user, final TLRPC.UserFull userFull, final org.telegram.ui.web.p pVar) {
        if (userFull.bot_can_manage_emoji_status) {
            pVar.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = org.telegram.messenger.g0.W(LaunchActivity.K1);
        if (W == null) {
            W = org.telegram.messenger.t0.f25457b;
        }
        final Context context = W;
        TLRPC.User f10 = h10.i(i3).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, null);
        n4 n4Var = new n4(f10);
        int i10 = k6.L5;
        int x02 = k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.f28530c0 = n4Var;
        s1Var.f28532d0 = x02;
        s1Var.f28535e0 = -1;
        alertDialog$Builder.n(i10, null);
        alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753088, l10.p(user), l10.p(user)));
        alertDialog$Builder.k(bd.M0(2131753090, null), new org.telegram.ui.ActionBar.p1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                int i12 = i3;
                boolean q10 = h10.i(i12).q();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                org.telegram.ui.web.p pVar2 = pVar;
                if (!q10) {
                    new vg.v0(new org.telegram.ui.ActionBar.d2(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        pVar2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                o4.e(context, i12, user2.f27150id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = hp.s1(i12).q1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i12).sendRequest(toggleuseremojistatuspermission, new r6(zArr4, pVar2, userFull, 9));
            }
        });
        alertDialog$Builder.h(bd.M0(2131753089, null), null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
        s1Var2.show();
        s1Var2.setOnDismissListener(new i4(zArr2, zArr, context, i3, user, pVar));
    }

    public static void c() {
        Context context = org.telegram.messenger.t0.f25457b;
        if (context != null) {
            for (int i3 = 0; i3 < 4; i3++) {
                context.getSharedPreferences("botemojistatus_" + i3, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i3, long j10) {
        if (activity == null) {
            return false;
        }
        return k5.w("requested_", j10, activity.getSharedPreferences("botemojistatus_" + i3, 0), false);
    }

    public static void e(Context context, int i3, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i3, 0).edit();
        edit.putBoolean("requested_" + j10, true).apply();
    }

    public static void f(final int i3, final TLRPC.User user, long j10, final int i10, final org.telegram.ui.web.p pVar) {
        TLRPC.Document e10 = g5.e(i3, j10);
        if (e10 != null) {
            g(i3, user, e10, i10, new e4(pVar, e10, 1));
        } else {
            g5.g(i3).b(j10, new d5() {
                @Override
                public final void a(TLRPC.Document document) {
                    org.telegram.messenger.g0.h3(new j4(i3, user, document, i10, pVar));
                }
            });
        }
    }

    public static void g(int i3, TLRPC.User user, TLRPC.Document document, int i10, u10 u10Var) {
        SpannableStringBuilder X2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            u10Var.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = org.telegram.messenger.g0.W(LaunchActivity.K1);
        if (W == null) {
            W = org.telegram.messenger.t0.f25457b;
        }
        ConnectionsManager.getInstance(i3).getCurrentTime();
        TLRPC.User f10 = h10.i(i3).f();
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
                sb2.append(bd.G(i11, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i13 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(bd.G(i13, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(bd.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753085, l10.p(user), sb2));
        } else {
            X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753086, l10.p(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, W, null);
        n4 n4Var = new n4(f10, document);
        int i14 = k6.L5;
        int x02 = k6.x0(null, i14, false);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.f28530c0 = n4Var;
        s1Var.f28532d0 = x02;
        s1Var.f28535e0 = -1;
        alertDialog$Builder.n(i14, null);
        alertDialog$Builder.f27343a.U = X2;
        alertDialog$Builder.k(bd.M0(2131753091, null), new g4(i3, zArr2, document, i10, zArr, u10Var));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
        s1Var2.show();
        s1Var2.setOnDismissListener(new ai.o(zArr2, zArr, u10Var, 3));
    }
}
