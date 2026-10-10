package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.nr0;
public final class k4 extends nr0 {
    public final f6 f1222b1;

    public k4(f6 f6Var, Context context, String str, String str2, boolean z10, y3 y3Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, y3Var);
        this.f1222b1 = f6Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        f6 f6Var = this.f1222b1;
        ad adVar = new ad(f6Var.f955c1, this.resourcesProvider);
        if (iVar.m() == 1) {
            long j3 = iVar.j(0);
            if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                org.telegram.ui.Components.tc G = adVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f31104r = false;
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
                org.telegram.ui.Components.tc G2 = adVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f31104r = false;
                G2.j();
            } else {
                org.telegram.ui.Components.tc G3 = adVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                G3.f31104r = false;
                G3.j();
            }
        } else {
            org.telegram.ui.Components.tc Q = adVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
            Q.f31104r = false;
            Q.j();
        }
        try {
            f6Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void T0(View view) {
        this.f1222b1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f1222b1.Z2 = null;
    }
}
