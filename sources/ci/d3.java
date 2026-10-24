package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
public final class d3 extends hr0 {
    public final p4 f5253e1;

    public d3(p4 p4Var, Context context, String str, String str2, boolean z10, s2 s2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, s2Var);
        this.f5253e1 = p4Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        p4 p4Var = this.f5253e1;
        vc vcVar = new vc(p4Var.f5656c1, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                oc G = vcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f29211r = false;
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
                oc G2 = vcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f29211r = false;
                G2.j();
            } else {
                oc G3 = vcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f29211r = false;
                G3.j();
            }
        } else {
            oc Q = vcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f29211r = false;
            Q.j();
        }
        try {
            p4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void X0(View view) {
        this.f5253e1.d1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f5253e1.Z2 = null;
    }
}
