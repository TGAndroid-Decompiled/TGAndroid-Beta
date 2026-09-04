package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
public final class w3 extends hq0 {
    public final o5 f3941b1;

    public w3(o5 o5Var, Context context, String str, String str2, boolean z10, k3 k3Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, k3Var);
        this.f3941b1 = o5Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        o5 o5Var = this.f3941b1;
        yc ycVar = new yc(o5Var.f3409c1, this.resourcesProvider);
        if (iVar.m() == 1) {
            long j3 = iVar.j(0);
            if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                qc G = ycVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f29687r = false;
                G.j();
            } else if (j3 < 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                int i11 = R.raw.forward;
                int i12 = R.string.StorySharedTo;
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = chat.title;
                }
                qc G2 = ycVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f29687r = false;
                G2.j();
            } else {
                qc G3 = ycVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                G3.f29687r = false;
                G3.j();
            }
        } else {
            qc Q = ycVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
            Q.f29687r = false;
            Q.j();
        }
        try {
            o5Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.f3941b1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f3941b1.Z2 = null;
    }
}
