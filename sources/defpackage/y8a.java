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
public abstract class y8a {
    public static void a(int i, long j, pt0 pt0Var) {
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
        TLRPC.UserFull W1 = na7.q1(i).W1(j);
        if (W1 == null) {
            na7.q1(i).Y2(V1, 0, true, new a61(pt0Var, i, V1, (byte) 4));
        } else {
            b(i, V1, W1, pt0Var);
        }
    }

    public static void b(final int i, final TLRPC.User user, final TLRPC.UserFull userFull, final pt0 pt0Var) {
        if (userFull.bot_can_manage_emoji_status) {
            pt0Var.a(Boolean.FALSE, "allowed");
            return;
        }
        Context W = gl.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        final Context context = W;
        TLRPC.User f = y6c.h(i).f();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, context);
        x8a x8aVar = new x8a(f);
        int i2 = bkb.K5;
        int w0 = bkb.w0(null, i2, false);
        hd hdVar = alertDialog$Builder.a;
        hdVar.c0 = x8aVar;
        hdVar.d0 = w0;
        hdVar.e0 = -1;
        alertDialog$Builder.m(i2, null);
        alertDialog$Builder.a.U = gl.T2(k96.a0(null, null, 2131753085, l7c.q(user), l7c.q(user)));
        alertDialog$Builder.j(k96.M0(2131753087, null), new ed() {
            @Override
            public final void u(hd hdVar2, int i3) {
                int i4 = i;
                boolean p = y6c.h(i4).p();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                pt0 pt0Var2 = pt0Var;
                if (!p) {
                    new jh8(new d(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        pt0Var2.a(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                y8a.e(context, i4, user2.id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = na7.q1(i4).o1(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i4).sendRequest(toggleuseremojistatuspermission, new ck8(zArr4, pt0Var2, userFull, (byte) 13));
            }
        });
        alertDialog$Builder.g(k96.M0(2131753086, null), null);
        hd hdVar2 = alertDialog$Builder.a;
        hdVar2.show();
        hdVar2.setOnDismissListener(new vz2(zArr2, zArr, context, i, user, pt0Var));
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
        return ls6.v("requested_", j, activity.getSharedPreferences("botemojistatus_" + i, 0), false);
    }

    public static void e(Context context, int i, long j) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i, 0).edit();
        edit.putBoolean("requested_" + j, true).apply();
    }

    public static void f(final int i, final TLRPC.User user, long j, final int i2, final pt0 pt0Var) {
        TLRPC.Document e = vl.e(i, j);
        if (e != null) {
            g(i, user, e, i2, new r8a(pt0Var, e, (byte) 1));
        } else {
            vl.g(i).b(j, new sl() {
                @Override
                public final void a(TLRPC.Document document) {
                    gl.d3(new zy0(i, user, document, i2, pt0Var));
                }
            });
        }
    }

    public static void g(int i, TLRPC.User user, TLRPC.Document document, int i2, p8c p8cVar) {
        SpannableStringBuilder T2;
        if (document instanceof TLRPC.TL_documentEmpty) {
            p8cVar.a("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context W = gl.W(LaunchActivity.H1);
        if (W == null) {
            W = a.b;
        }
        ConnectionsManager.getInstance(i).getCurrentTime();
        TLRPC.User f = y6c.h(i).f();
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
                sb.append(k96.G(i3, "BotEmojiStatusSetRequestForDay", new Object[0]));
            }
            if (i5 > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(k96.G(i5, "BotEmojiStatusSetRequestForHour", new Object[0]));
            }
            if (round > 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(k96.G(round, "BotEmojiStatusSetRequestForMinute", new Object[0]));
            }
            T2 = gl.T2(k96.a0(null, null, 2131753082, l7c.q(user), sb));
        } else {
            T2 = gl.T2(k96.a0(null, null, 2131753083, l7c.q(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, W);
        x8a x8aVar = new x8a(f, document);
        int i6 = bkb.K5;
        int w0 = bkb.w0(null, i6, false);
        hd hdVar = alertDialog$Builder.a;
        hdVar.c0 = x8aVar;
        hdVar.d0 = w0;
        hdVar.e0 = -1;
        alertDialog$Builder.m(i6, null);
        alertDialog$Builder.a.U = T2;
        alertDialog$Builder.j(k96.M0(2131753088, null), new pm0(i, zArr2, document, i2, zArr, p8cVar));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        hd hdVar2 = alertDialog$Builder.a;
        hdVar2.show();
        hdVar2.setOnDismissListener(new bg(zArr2, zArr, p8cVar, (byte) 7));
    }
}
