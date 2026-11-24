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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class yaa {
    public static void a(int i, long j, yu0 yu0Var) {
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
        TLRPC.UserFull X1 = oc7.r1(i).X1(j);
        if (X1 == null) {
            oc7.r1(i).b3(W1, 0, true, new h71(yu0Var, i, W1, (byte) 4));
        } else {
            b(i, W1, X1, yu0Var);
        }
    }

    public static void b(final int i, final TLRPC.User user, final TLRPC.UserFull userFull, final yu0 yu0Var) {
        if (userFull.bot_can_manage_emoji_status) {
            yu0Var.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = gm.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        final Context context = W;
        TLRPC.User f = z8c.h(i).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, context);
        xaa xaaVar = new xaa(f);
        int i2 = cmb.K5;
        int w0 = cmb.w0(null, i2, false);
        he heVar = alertDialog$Builder.a;
        heVar.c0 = xaaVar;
        heVar.d0 = w0;
        heVar.e0 = -1;
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.a.U = gm.S2(jb6.a0(null, null, 2131753053, m9c.r(user), m9c.r(user)));
        alertDialog$Builder.j(jb6.M0(2131753055, null), new ee() {
            @Override
            public final void r(he heVar2, int i3) {
                int i4 = i;
                boolean p = z8c.h(i4).p();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                yu0 yu0Var2 = yu0Var;
                if (!p) {
                    new kj8(new d(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        yu0Var2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                yaa.e(context, i4, user2.id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = oc7.r1(i4).p1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i4).sendRequest(toggleuseremojistatuspermission, new fm8(zArr4, yu0Var2, userFull, (byte) 13));
            }
        });
        alertDialog$Builder.g(jb6.M0(2131753054, null), null);
        he heVar2 = alertDialog$Builder.a;
        heVar2.show();
        heVar2.setOnDismissListener(new g13(zArr2, zArr, context, i, user, yu0Var));
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
        return kt6.w("requested_", j, activity.getSharedPreferences("botemojistatus_" + i, 0), false);
    }

    public static void e(Context context, int i, long j) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i, 0).edit();
        edit.putBoolean("requested_" + j, true).apply();
    }

    public static void f(final int i, final TLRPC.User user, long j, final int i2, final yu0 yu0Var) {
        TLRPC.Document e = vm.e(i, j);
        if (e != null) {
            g(i, user, e, i2, new raa(yu0Var, e, (byte) 1));
        } else {
            vm.g(i).b(j, new sm() {
                @Override
                public final void a(TLRPC.Document document) {
                    gm.c3(new g01(i, user, document, i2, yu0Var));
                }
            });
        }
    }

    public static void g(int i, TLRPC.User user, TLRPC.Document document, int i2, qac qacVar) {
        SpannableStringBuilder S2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            qacVar.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = gm.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        ConnectionsManager.getInstance(i).getCurrentTime();
        TLRPC.User f = z8c.h(i).f();
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
                sb.append(jb6.G(i3, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i5 > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(jb6.G(i5, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(jb6.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            S2 = gm.S2(jb6.a0(null, null, 2131753050, m9c.r(user), sb));
        } else {
            S2 = gm.S2(jb6.a0(null, null, 2131753051, m9c.r(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, W);
        xaa xaaVar = new xaa(f, document);
        int i6 = cmb.K5;
        int w0 = cmb.w0(null, i6, false);
        he heVar = alertDialog$Builder.a;
        heVar.c0 = xaaVar;
        heVar.d0 = w0;
        heVar.e0 = -1;
        alertDialog$Builder.m(i6, null);
        alertDialog$Builder.a.U = S2;
        alertDialog$Builder.j(jb6.M0(2131753056, null), new pn0(i, zArr2, document, i2, zArr, qacVar));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        he heVar2 = alertDialog$Builder.a;
        heVar2.show();
        heVar2.setOnDismissListener(new ah(zArr2, zArr, qacVar, (byte) 7));
    }
}
