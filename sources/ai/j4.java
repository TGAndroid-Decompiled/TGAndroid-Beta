package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.xc;
public final class j4 extends hq0 {
    public final e6 f1027b1;

    public j4(e6 e6Var, Context context, String str, String str2, boolean z10, x3 x3Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, x3Var);
        this.f1027b1 = e6Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        e6 e6Var = this.f1027b1;
        xc xcVar = new xc(e6Var.f776c1, this.resourcesProvider);
        if (iVar.m() == 1) {
            long j3 = iVar.j(0);
            if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                org.telegram.ui.Components.qc G = xcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f27314r = false;
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
                org.telegram.ui.Components.qc G2 = xcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f27314r = false;
                G2.j();
            } else {
                org.telegram.ui.Components.qc G3 = xcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                G3.f27314r = false;
                G3.j();
            }
        } else {
            org.telegram.ui.Components.qc Q = xcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
            Q.f27314r = false;
            Q.j();
        }
        try {
            e6Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.f1027b1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f1027b1.Z2 = null;
    }
}
