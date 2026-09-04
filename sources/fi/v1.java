package fi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.uy;
public final class v1 implements Utilities.Callback {
    public final eg1 f10025a;
    public final uy f10026b;
    public final long f10027c;
    public final int d;

    public v1(eg1 eg1Var, uy uyVar, long j3, int i10) {
        this.f10025a = eg1Var;
        this.f10026b = uyVar;
        this.f10027c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        eg1 eg1Var = this.f10025a;
        uy uyVar = this.f10026b;
        if (eg1Var != null) {
            eg1Var.finishFragment();
            uyVar.removeSelfFromStack();
        } else {
            uyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j3 = this.f10027c;
        int i11 = this.d;
        if (j3 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
            if (chat == null) {
                str = "";
                user = chat;
            } else {
                str = chat.title;
                user = chat;
            }
        }
        yc a02 = yc.a0(U);
        if (bool.booleanValue()) {
            i10 = R.string.BotSentRevokeVerifyRequest;
        } else {
            i10 = R.string.BotSentVerifyRequest;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, str));
        a02.getClass();
        a02.V(Arrays.asList(user), replaceTags, null, null).k(false);
    }
}
