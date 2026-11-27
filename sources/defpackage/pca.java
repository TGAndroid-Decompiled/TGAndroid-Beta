package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class pca {
    public static void a(int i, long j, yt0 yt0Var) {
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
        TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
        if (Y1 == null) {
            uc7.s1(i).f3(X1, 0, true, new i61(yt0Var, i, X1, (byte) 4));
        } else {
            b(i, X1, Y1, yt0Var);
        }
    }

    public static void b(final int i, final TLRPC.User user, final TLRPC.UserFull userFull, final yt0 yt0Var) {
        if (userFull.bot_can_manage_emoji_status) {
            yt0Var.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = hl.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        final Context context = W;
        TLRPC.User f = yac.h(i).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, context);
        oca ocaVar = new oca(f);
        int i2 = aob.L5;
        int w0 = aob.w0(null, i2, false);
        id idVar = alertDialog$Builder.a;
        idVar.c0 = ocaVar;
        idVar.d0 = w0;
        idVar.e0 = -1;
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.a.U = hl.S2(ob6.a0(null, null, 2131753081, lbc.r(user), lbc.r(user)));
        alertDialog$Builder.j(ob6.M0(2131753083, null), new fd() {
            @Override
            public final void w(id idVar2, int i3) {
                int i4 = i;
                boolean p = yac.h(i4).p();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                yt0 yt0Var2 = yt0Var;
                if (!p) {
                    new xk8(new e(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        yt0Var2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                pca.e(context, i4, user2.id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = uc7.s1(i4).q1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i4).sendRequest(toggleuseremojistatuspermission, new qn8(zArr4, yt0Var2, userFull, (byte) 13));
            }
        });
        alertDialog$Builder.g(ob6.M0(2131753082, null), null);
        id idVar2 = alertDialog$Builder.a;
        idVar2.show();
        idVar2.setOnDismissListener(new o03(zArr2, zArr, context, i, user, yt0Var));
    }

    public static void c() {
        Context context = a.b;
        if (context != null) {
            for (int i = 0; i < 4; i++) {
                context.getSharedPreferences("botemojistatus_" + i, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i, long j) {
        if (activity == null) {
            return false;
        }
        return qu6.v("requested_", j, activity.getSharedPreferences("botemojistatus_" + i, 0), false);
    }

    public static void e(Context context, int i, long j) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i, 0).edit();
        edit.putBoolean("requested_" + j, true).apply();
    }

    public static void f(final int i, final TLRPC.User user, long j, final int i2, final yt0 yt0Var) {
        TLRPC.Document e = wl.e(i, j);
        if (e != null) {
            g(i, user, e, i2, new ica(yt0Var, e, (byte) 1));
        } else {
            wl.g(i).b(j, new tl() {
                @Override
                public final void a(TLRPC.Document document) {
                    hl.c3(new hz0(i, user, document, i2, yt0Var));
                }
            });
        }
    }

    public static void g(int i, TLRPC.User user, TLRPC.Document document, int i2, pcc pccVar) {
        SpannableStringBuilder S2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            pccVar.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = hl.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        ConnectionsManager.getInstance(i).getCurrentTime();
        TLRPC.User f = yac.h(i).f();
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        if (i2 > 0) {
            int i3 = i2 / 86400;
            int i4 = i2 - (86400 * i3);
            int i5 = i4 / 3600;
            int round = Math.round((i4 - (i5 * 3600)) / 60.0f);
            StringBuilder sb = new StringBuilder();
            if (i3 > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(ob6.G(i3, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i5 > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(ob6.G(i5, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(ob6.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            S2 = hl.S2(ob6.a0(null, null, 2131753078, lbc.r(user), sb));
        } else {
            S2 = hl.S2(ob6.a0(null, null, 2131753079, lbc.r(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, W);
        oca ocaVar = new oca(f, document);
        int i6 = aob.L5;
        int w0 = aob.w0(null, i6, false);
        id idVar = alertDialog$Builder.a;
        idVar.c0 = ocaVar;
        idVar.d0 = w0;
        idVar.e0 = -1;
        alertDialog$Builder.m(i6, null);
        alertDialog$Builder.a.U = S2;
        alertDialog$Builder.j(ob6.M0(2131753084, null), new qm0(i, zArr2, document, i2, zArr, pccVar));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        id idVar2 = alertDialog$Builder.a;
        idVar2.show();
        idVar2.setOnDismissListener(new cf(zArr2, zArr, pccVar, (byte) 8));
    }
}
