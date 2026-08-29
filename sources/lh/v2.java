package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
public final class v2 extends dq0 {
    public final d4 X0;

    public v2(d4 d4Var, Context context, String str, String str2, boolean z10, l2 l2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, l2Var);
        this.X0 = d4Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        d4 d4Var = this.X0;
        tc tcVar = new tc(d4Var.Y0, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                mc G = tcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f30660r = false;
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
                mc G2 = tcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f30660r = false;
                G2.j();
            } else {
                mc G3 = tcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f30660r = false;
                G3.j();
            }
        } else {
            mc Q = tcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f30660r = false;
            Q.j();
        }
        try {
            d4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.X0.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.X0.V2 = null;
    }
}
