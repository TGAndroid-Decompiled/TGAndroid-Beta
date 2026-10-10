package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.y9;
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
        frameLayout2.setBackground(i6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), i6.x0(null, i6.f20794ci, false)));
        y9 y9Var = new y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        j9 j9Var = new j9((e6) null);
        j9Var.p(user);
        y9Var.e(user, j9Var);
        frameLayout2.addView(y9Var, x5.e(28, 28, 51));
        y9 y9Var2 = new y9(activity);
        y9Var2.setEmojiColorFilter(new PorterDuffColorFilter(i6.x0(null, i6.f21206z9, false), PorterDuff.Mode.SRC_IN));
        y9Var2.setAnimatedEmojiDrawable(s5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(y9Var2, x5.a(20.0f, 34.0f, 0.0f, 0.0f, 0.0f, 20, 19));
        j5 j5Var = new j5(activity);
        j5Var.setTextColor(i6.x0(null, i6.f20909j5, false));
        j5Var.setTextSize(13);
        j5Var.setEllipsizeByGradient(true);
        j5Var.l(str, false);
        j5Var.setWidthWrapContent(true);
        frameLayout2.addView(j5Var, x5.a(-2.0f, 57.0f, 0.0f, 10.0f, 0.0f, -2, 19));
        frameLayout.addView(frameLayout2, x5.a(-2.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 17));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        if (i12 >= 0) {
            i11 = R.string.BotRemoveVerificationText;
        } else {
            i11 = R.string.BotRemoveVerificationChatText;
        }
        alertDialog$Builder.f20378a.T = LocaleController.getString(i11);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i13) {
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
                ConnectionsManager.getInstance(i14).sendRequest(setcustomverification, new ai.v1(8, zArr2, v1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
