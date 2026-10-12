package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.LaunchActivity;
public abstract class c5 {
    public static void a(int i10, long j10, org.telegram.ui.web.q qVar) {
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        if (userFull == null) {
            MessagesController.getInstance(i10).loadFullUser(user, 0, true, new r4(qVar, i10, user, 0));
        } else {
            b(i10, user, userFull, qVar);
        }
    }

    public static void b(final int i10, final TLRPC.User user, final TLRPC.UserFull userFull, final org.telegram.ui.web.q qVar) {
        if (userFull.bot_can_manage_emoji_status) {
            qVar.run(Boolean.FALSE, "allowed");
            return;
        }
        Context findActivity = AndroidUtilities.findActivity(LaunchActivity.G1);
        if (findActivity == null) {
            findActivity = ApplicationLoader.applicationContext;
        }
        final Context context = findActivity;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, null);
        b5 b5Var = new b5(currentUser);
        int x02 = g6.x0(null, g6.L5, false);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.f19561b0 = b5Var;
        a2Var.f19564c0 = x02;
        alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BotEmojiStatusPermissionAllow), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                int i12 = i10;
                boolean isPremium = UserConfig.getInstance(i12).isPremium();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                org.telegram.ui.web.q qVar2 = qVar;
                if (!isPremium) {
                    new sg.y0(new org.telegram.ui.ActionBar.m2(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        qVar2.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                c5.e(context, i12, user2.f19363id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(i12).getInputUser(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i12).sendRequest(toggleuseremojistatuspermission, new bi.e5(zArr4, qVar2, userFull, 3));
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.BotEmojiStatusPermissionDecline), null);
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19548a;
        a2Var2.show();
        a2Var2.setOnDismissListener(new w4(zArr2, zArr, context, i10, user, qVar));
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context != null) {
            for (int i10 = 0; i10 < 4; i10++) {
                context.getSharedPreferences("botemojistatus_" + i10, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i10, long j10) {
        if (activity == null) {
            return false;
        }
        return org.telegram.messenger.q.x("requested_", j10, activity.getSharedPreferences("botemojistatus_" + i10, 0), false);
    }

    public static void e(Context context, int i10, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i10, 0).edit();
        edit.putBoolean("requested_" + j10, true).apply();
    }

    public static void f(final int i10, final TLRPC.User user, long j10, final int i11, final org.telegram.ui.web.q qVar) {
        TLRPC.Document f7 = s5.f(i10, j10);
        if (f7 != null) {
            g(i10, user, f7, i11, new s4(qVar, f7, 1));
        } else {
            s5.h(i10).b(j10, new p5() {
                @Override
                public final void a(TLRPC.Document document) {
                    AndroidUtilities.runOnUIThread(new x4(i10, user, document, i11, qVar));
                }
            });
        }
    }

    public static void g(int i10, TLRPC.User user, TLRPC.Document document, int i11, Utilities.Callback callback) {
        SpannableStringBuilder replaceTags;
        if (document instanceof TLRPC.TL_documentEmpty) {
            callback.run("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context findActivity = AndroidUtilities.findActivity(LaunchActivity.G1);
        if (findActivity == null) {
            findActivity = ApplicationLoader.applicationContext;
        }
        ConnectionsManager.getInstance(i10).getCurrentTime();
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        if (i11 > 0) {
            int i12 = i11 / 86400;
            int i13 = i11 - (86400 * i12);
            int i14 = i13 / 3600;
            int round = Math.round((i13 - (i14 * 3600)) / 60.0f);
            StringBuilder sb2 = new StringBuilder();
            if (i12 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForDay", i12, new Object[0]));
            }
            if (i14 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForHour", i14, new Object[0]));
            }
            if (round > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForMinute", round, new Object[0]));
            }
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusSetRequestFor, UserObject.getUserName(user), sb2));
        } else {
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusSetRequest, UserObject.getUserName(user)));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(findActivity, 0, null);
        b5 b5Var = new b5(currentUser, document);
        int x02 = g6.x0(null, g6.L5, false);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.f19561b0 = b5Var;
        a2Var.f19564c0 = x02;
        a2Var.T = replaceTags;
        alertDialog$Builder.k(LocaleController.getString(R.string.BotEmojiStatusConfirm), new u4(i10, zArr2, document, i11, zArr, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19548a;
        a2Var2.show();
        a2Var2.setOnDismissListener(new s0(zArr2, zArr, callback));
    }
}
