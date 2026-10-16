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
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kg1;
import org.telegram.ui.yy;
public final class u1 implements Utilities.Callback {
    public final kg1 f9578a;
    public final yy f9579b;
    public final long f9580c;
    public final int d;

    public u1(kg1 kg1Var, yy yyVar, long j10, int i10) {
        this.f9578a = kg1Var;
        this.f9579b = yyVar;
        this.f9580c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        kg1 kg1Var = this.f9578a;
        yy yyVar = this.f9579b;
        if (kg1Var != null) {
            kg1Var.finishFragment();
            yyVar.removeSelfFromStack();
        } else {
            yyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f9580c;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.d;
        if (i11 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
                user = chat;
            } else {
                str = chat.title;
                user = chat;
            }
        }
        zc a02 = zc.a0(U);
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
