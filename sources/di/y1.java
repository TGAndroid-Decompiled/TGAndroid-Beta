package di;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.wy;
public final class y1 implements Utilities.Callback {
    public final ig1 f7026a;
    public final wy f7027b;
    public final long f7028c;
    public final int d;

    public y1(ig1 ig1Var, wy wyVar, long j3, int i10) {
        this.f7026a = ig1Var;
        this.f7027b = wyVar;
        this.f7028c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        ig1 ig1Var = this.f7026a;
        wy wyVar = this.f7027b;
        if (ig1Var != null) {
            ig1Var.finishFragment();
            wyVar.removeSelfFromStack();
        } else {
            wyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j3 = this.f7028c;
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
        wc a02 = wc.a0(U);
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
