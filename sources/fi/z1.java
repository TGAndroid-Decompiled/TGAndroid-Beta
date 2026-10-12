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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z9;
import w7.a6;
public abstract class z1 {
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.botVerifierSettings botverifiersettings, final u1 u1Var) {
        String str;
        TLRPC.User user;
        int i11;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
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
        frameLayout2.setBackground(g6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), g6.x0(null, g6.f19894ci, false)));
        z9 z9Var = new z9(activity);
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        k9 k9Var = new k9((c6) null);
        k9Var.p(user);
        z9Var.e(user, k9Var);
        frameLayout2.addView(z9Var, a6.e(28, 28, 51));
        z9 z9Var2 = new z9(activity);
        z9Var2.setEmojiColorFilter(new PorterDuffColorFilter(g6.x0(null, g6.f20308z9, false), PorterDuff.Mode.SRC_IN));
        z9Var2.setAnimatedEmojiDrawable(s5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(z9Var2, a6.a(20.0f, 34.0f, 0.0f, 0.0f, 0.0f, 20, 19));
        h5 h5Var = new h5(activity);
        h5Var.setTextColor(g6.x0(null, g6.f20007j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str, false);
        h5Var.setWidthWrapContent(true);
        frameLayout2.addView(h5Var, a6.a(-2.0f, 57.0f, 0.0f, 10.0f, 0.0f, -2, 19));
        frameLayout.addView(frameLayout2, a6.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 17));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        if (i12 >= 0) {
            i11 = R.string.BotRemoveVerificationText;
        } else {
            i11 = R.string.BotRemoveVerificationChatText;
        }
        alertDialog$Builder.f19548a.T = LocaleController.getString(i11);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i13) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i14 = i10;
                setcustomverification.bot = MessagesController.getInstance(i14).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i14).getInputPeer(j11);
                ConnectionsManager.getInstance(i14).sendRequest(setcustomverification, new bi.m1(8, zArr2, u1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
