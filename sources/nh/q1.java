package nh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gy;
import org.telegram.ui.we1;

public final class q1 implements Utilities.Callback {

    public final we1 f18898a;

    public final gy f18899b;

    public final long f18900c;
    public final int d;

    public q1(we1 we1Var, gy gyVar, long j10, int i10) {
        this.f18898a = we1Var;
        this.f18899b = gyVar;
        this.f18900c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String forcedFirstName;
        TLObject tLObject;
        Boolean bool = (Boolean) obj;
        we1 we1Var = this.f18898a;
        gy gyVar = this.f18899b;
        if (we1Var != null) {
            we1Var.finishFragment();
            gyVar.removeSelfFromStack();
        } else {
            gyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        long j10 = this.f18900c;
        int i10 = this.d;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        mc mcVarA0 = mc.a0(n2VarU);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, forcedFirstName));
        mcVarA0.getClass();
        mcVarA0.V(Arrays.asList(tLObject), spannableStringBuilderReplaceTags, null, null).k(false);
    }
}
