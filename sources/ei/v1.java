package ei;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ty;
import org.telegram.ui.wf1;
public final class v1 implements Utilities.Callback {
    public final wf1 f8659a;
    public final ty f8660b;
    public final long f8661c;
    public final int d;

    public v1(wf1 wf1Var, ty tyVar, long j3, int i10) {
        this.f8659a = wf1Var;
        this.f8660b = tyVar;
        this.f8661c = j3;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        wf1 wf1Var = this.f8659a;
        ty tyVar = this.f8660b;
        if (wf1Var != null) {
            wf1Var.finishFragment();
            tyVar.removeSelfFromStack();
        } else {
            tyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j3 = this.f8661c;
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
        xc a02 = xc.a0(U);
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
