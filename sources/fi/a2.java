package fi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.x9;
import w7.x5;
public abstract class a2 {
    public static void a(Activity activity, final int i10, final long j3, final long j10, TL_bots.botVerifierSettings botverifiersettings, final v1 v1Var) {
        String str;
        TLRPC.User user;
        int i11;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
                user = chat;
            } else {
                str = chat.title;
                user = chat;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), j6.w0(null, j6.f20656ci, false)));
        x9 x9Var = new x9(activity);
        x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        i9 i9Var = new i9((f6) null);
        i9Var.p(user);
        x9Var.e(user, i9Var);
        frameLayout2.addView(x9Var, x5.e(28, 28, 51));
        x9 x9Var2 = new x9(activity);
        x9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f21064z9, false), PorterDuff.Mode.SRC_IN));
        x9Var2.setAnimatedEmojiDrawable(q5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(x9Var2, x5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        j5 j5Var = new j5(activity);
        j5Var.setTextColor(j6.w0(null, j6.f20770j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout2.addView(j5Var, x5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, x5.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        if (i12 >= 0) {
            i11 = R.string.BotRemoveVerificationText;
        } else {
            i11 = R.string.BotRemoveVerificationChatText;
        }
        alertDialog$Builder.f20198a.T = LocaleController.getString(i11);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i14 = i10;
                setcustomverification.bot = MessagesController.getInstance(i14).getInputUser(j3);
                setcustomverification.peer = MessagesController.getInstance(i14).getInputPeer(j10);
                ConnectionsManager.getInstance(i14).sendRequest(setcustomverification, new bi.m1(8, zArr2, v1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
