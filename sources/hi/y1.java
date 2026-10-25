package hi;

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
import org.telegram.ui.af1;
import org.telegram.ui.cy;
public final class y1 implements Utilities.Callback {
    public final af1 f13376a;
    public final cy f13377b;
    public final long f13378c;
    public final int d;

    public y1(af1 af1Var, cy cyVar, long j10, int i10) {
        this.f13376a = af1Var;
        this.f13377b = cyVar;
        this.f13378c = j10;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        String str;
        TLRPC.User user;
        int i10;
        Boolean bool = (Boolean) obj;
        af1 af1Var = this.f13376a;
        cy cyVar = this.f13377b;
        if (af1Var != null) {
            af1Var.finishFragment();
            cyVar.removeSelfFromStack();
        } else {
            cyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.f13378c;
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
        wc b02 = wc.b0(U);
        if (bool.booleanValue()) {
            i10 = R.string.BotSentRevokeVerifyRequest;
        } else {
            i10 = R.string.BotSentVerifyRequest;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, str));
        b02.getClass();
        b02.W(Arrays.asList(user), replaceTags, null, null).k(false);
    }
}
