package nh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public abstract class u1 {
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.botVerifierSettings botverifiersettings, final q1 q1Var) {
        String forcedFirstName;
        TLObject tLObject;
        if (j11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), g6.w0(null, g6.ci, false)));
        n9 n9Var = new n9(activity);
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        y8 y8Var = new y8((c6) null);
        y8Var.p(tLObject);
        n9Var.e(tLObject, y8Var);
        frameLayout2.addView(n9Var, z5.e(28, 28, 51));
        n9 n9Var2 = new n9(activity);
        n9Var2.setEmojiColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23444z9, false), PorterDuff.Mode.SRC_IN));
        n9Var2.setAnimatedEmojiDrawable(k5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(n9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        h5 h5Var = new h5(activity);
        h5Var.setTextColor(g6.w0(null, g6.f23161j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(forcedFirstName, false);
        h5Var.setWidthWrapContent(true);
        frameLayout2.addView(h5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(j11 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i12 = i10;
                setcustomverification.bot = MessagesController.getInstance(i12).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i12).getInputPeer(j11);
                ConnectionsManager.getInstance(i12).sendRequest(setcustomverification, new cg.g0(18, zArr2, q1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
