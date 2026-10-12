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
import org.telegram.ui.lg1;
import org.telegram.ui.yy;
public final class u1 implements Utilities.Callback {
    public final lg1 f9575a;
    public final yy f9576b;
    public final long f9577c;
    public final int d;

    public u1(lg1 lg1Var, yy yyVar, long j10, int i10) {
        this.f9575a = lg1Var;
        this.f9576b = yyVar;
        this.f9577c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        lg1 lg1Var = this.f9575a;
        yy yyVar = this.f9576b;
        if (lg1Var != null) {
            lg1Var.finishFragment();
            yyVar.removeSelfFromStack();
        } else {
            yyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f9577c;
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
