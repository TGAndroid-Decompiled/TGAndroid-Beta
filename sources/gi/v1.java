package gi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u9;
import w7.z5;
public abstract class v1 {
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.BotVerifierSettings botVerifierSettings, final r1 r1Var) {
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
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i13 = k6.f21177ci;
        ShapeDrawable d02 = k6.d0(dp, dp2, k6.x0(null, i13, false));
        n6 O = r6.O(i13);
        frameLayout2.setBackground(d02);
        r6.k(frameLayout2, d02, O, null, null);
        u9 u9Var = new u9(activity);
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        f9 f9Var = new f9((g6) null);
        f9Var.p(user);
        u9Var.e(user, f9Var);
        frameLayout2.addView(u9Var, z5.e(28, 28, 51));
        u9 u9Var2 = new u9(activity);
        u9Var2.setEmojiColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.f21592z9, false), PorterDuff.Mode.SRC_IN));
        u9Var2.setAnimatedEmojiDrawable(p5.n(i10, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(u9Var2, z5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        n5 n5Var = new n5(activity);
        r6.Z(n5Var, k6.f21290j5, null);
        n5Var.setTextSize(13);
        n5Var.setEllipsizeByGradient(true);
        n5Var.l(str, false);
        n5Var.setWidthWrapContent(true);
        frameLayout2.addView(n5Var, z5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        if (i12 >= 0) {
            i11 = R.string.BotRemoveVerificationText;
        } else {
            i11 = R.string.BotRemoveVerificationChatText;
        }
        alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.z1() {
            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i15 = i10;
                setcustomverification.bot = MessagesController.getInstance(i15).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i15).getInputPeer(j11);
                ConnectionsManager.getInstance(i15).sendRequest(setcustomverification, new ai.g(15, zArr2, r1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
