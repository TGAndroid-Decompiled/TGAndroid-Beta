package mh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.we1;
public final class r1 implements Utilities.Callback {
    public final we1 f18072a;
    public final dy f18073b;
    public final long f18074c;
    public final int d;

    public r1(we1 we1Var, dy dyVar, long j10, int i9) {
        this.f18072a = we1Var;
        this.f18073b = dyVar;
        this.f18074c = j10;
        this.d = i9;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i9;
        Boolean bool = (Boolean) obj;
        we1 we1Var = this.f18072a;
        dy dyVar = this.f18073b;
        if (we1Var != null) {
            we1Var.finishFragment();
            dyVar.removeSelfFromStack();
        } else {
            dyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f18074c;
        int i10 = this.d;
        if (j10 >= 0) {
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
        oc a02 = oc.a0(U);
        if (bool.booleanValue()) {
            i9 = R.string.BotSentRevokeVerifyRequest;
        } else {
            i9 = R.string.BotSentVerifyRequest;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i9, str));
        a02.getClass();
        a02.V(Arrays.asList(user), replaceTags, null, null).k(false);
    }
}
