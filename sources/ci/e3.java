package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
public final class e3 extends fr0 {
    public final q4 f5352c1;

    public e3(q4 q4Var, Context context, String str, String str2, boolean z10, t2 t2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, t2Var);
        this.f5352c1 = q4Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        q4 q4Var = this.f5352c1;
        xc xcVar = new xc(q4Var.f5769c1, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                qc G = xcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f29542r = false;
                G.j();
            } else if (j10 < 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                int i11 = R.raw.forward;
                int i12 = R.string.StorySharedTo;
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = chat.title;
                }
                qc G2 = xcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f29542r = false;
                G2.j();
            } else {
                qc G3 = xcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f29542r = false;
                G3.j();
            }
        } else {
            qc Q = xcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f29542r = false;
            Q.j();
        }
        try {
            q4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void U0(View view) {
        this.f5352c1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f5352c1.Z2 = null;
    }
}
