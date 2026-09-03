package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.qc;
public final class x2 extends lq0 {
    public final f4 Y0;

    public x2(f4 f4Var, Context context, String str, String str2, boolean z4, n2 n2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z4, null, n2Var);
        this.Y0 = f4Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        String str;
        if (!z4) {
            return;
        }
        f4 f4Var = this.Y0;
        qc qcVar = new qc(f4Var.Z0, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                ic G = qcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f27786r = false;
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
                ic G2 = qcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f27786r = false;
                G2.j();
            } else {
                ic G3 = qcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f27786r = false;
                G3.j();
            }
        } else {
            ic Q = qcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f27786r = false;
            Q.j();
        }
        try {
            f4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.Y0.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.Y0.W2 = null;
    }
}
