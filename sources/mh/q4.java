package mh;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.k5;
import org.telegram.ui.LaunchActivity;
public abstract class q4 {
    public static void a(int i9, long j10, org.telegram.ui.web.r rVar) {
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
        if (userFull == null) {
            MessagesController.getInstance(i9).loadFullUser(user, 0, true, new fh.v2(rVar, i9, user, 1));
        } else {
            b(i9, user, userFull, rVar);
        }
    }

    public static void b(final int i9, final TLRPC.User user, final TLRPC.UserFull userFull, final org.telegram.ui.web.r rVar) {
        if (userFull.bot_can_manage_emoji_status) {
            rVar.run(Boolean.FALSE, "allowed");
            return;
        }
        Context findActivity = AndroidUtilities.findActivity(LaunchActivity.C1);
        if (findActivity == null) {
            findActivity = ApplicationLoader.applicationContext;
        }
        final Context context = findActivity;
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
        final boolean[] zArr = new boolean[1];
        final boolean[] zArr2 = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, null);
        p4 p4Var = new p4(currentUser);
        int w02 = f6.w0(null, f6.L5, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.X = p4Var;
        c2Var.Y = w02;
        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.BotEmojiStatusPermissionAllow), new org.telegram.ui.ActionBar.b2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                int i11 = i9;
                boolean isPremium = UserConfig.getInstance(i11).isPremium();
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                org.telegram.ui.web.r rVar2 = rVar;
                if (!isPremium) {
                    new zf.x0(new org.telegram.ui.ActionBar.o2(null), 12, false).show();
                    if (!zArr3[0] && !zArr4[0]) {
                        zArr4[0] = true;
                        rVar2.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                zArr3[0] = true;
                TLRPC.User user2 = user;
                q4.e(context, i11, user2.f22527id);
                TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
                toggleuseremojistatuspermission.bot = MessagesController.getInstance(i11).getInputUser(user2);
                toggleuseremojistatuspermission.enabled = true;
                ConnectionsManager.getInstance(i11).sendRequest(toggleuseremojistatuspermission, new bg.b0(zArr4, rVar2, userFull, 14));
            }
        });
        alertDialog$Builder.h(LocaleController.getString(R.string.BotEmojiStatusPermissionDecline), null);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
        c2Var2.show();
        c2Var2.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                if (!zArr2[0]) {
                    boolean[] zArr3 = zArr;
                    if (!zArr3[0]) {
                        zArr3[0] = true;
                        q4.e(context, i9, user.f22527id);
                        rVar.run(Boolean.TRUE, "cancelled");
                    }
                }
            }
        });
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context != null) {
            for (int i9 = 0; i9 < 4; i9++) {
                context.getSharedPreferences("botemojistatus_" + i9, 0).edit().clear().apply();
            }
        }
    }

    public static boolean d(Activity activity, int i9, long j10) {
        if (activity == null) {
            return false;
        }
        return org.telegram.messenger.l0.v("requested_", j10, activity.getSharedPreferences("botemojistatus_" + i9, 0), false);
    }

    public static void e(Context context, int i9, long j10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("botemojistatus_" + i9, 0).edit();
        edit.putBoolean("requested_" + j10, true).apply();
    }

    public static void f(final int i9, final TLRPC.User user, long j10, final int i10, final org.telegram.ui.web.r rVar) {
        TLRPC.Document f10 = k5.f(i9, j10);
        if (f10 != null) {
            g(i9, user, f10, i10, new h4(rVar, f10, 1));
        } else {
            k5.h(i9).b(j10, new h5() {
                @Override
                public final void a(TLRPC.Document document) {
                    AndroidUtilities.runOnUIThread(new l4(i9, user, document, i10, rVar));
                }
            });
        }
    }

    public static void g(int i9, TLRPC.User user, TLRPC.Document document, int i10, Utilities.Callback callback) {
        SpannableStringBuilder replaceTags;
        if (document instanceof TLRPC.TL_documentEmpty) {
            callback.run("SUGGESTED_EMOJI_INVALID");
            return;
        }
        Context findActivity = AndroidUtilities.findActivity(LaunchActivity.C1);
        if (findActivity == null) {
            findActivity = ApplicationLoader.applicationContext;
        }
        ConnectionsManager.getInstance(i9).getCurrentTime();
        TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
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
                sb2.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForDay", i11, new Object[0]));
            }
            if (i13 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(LocaleController.formatPluralString("BotEmojiStatusSetRequestForHour", i13, new Object[0]));
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
        p4 p4Var = new p4(currentUser, document);
        int w02 = f6.w0(null, f6.L5, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.X = p4Var;
        c2Var.Y = w02;
        c2Var.P = replaceTags;
        alertDialog$Builder.k(LocaleController.getString(R.string.BotEmojiStatusConfirm), new bg.g(i9, zArr2, document, i10, zArr, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
        c2Var2.show();
        c2Var2.setOnDismissListener(new fh.j(zArr2, zArr, callback, 3));
    }
}
