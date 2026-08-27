package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sp0;

public final class w2 extends sp0 {
    public final e4 X0;

    public w2(e4 e4Var, Context context, String str, String str2, boolean z10, m2 m2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, m2Var);
        this.X0 = e4Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            e4 e4Var = this.X0;
            mc mcVar = new mc(e4Var.Y0, this.resourcesProvider);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    ec ecVarG = mcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                    ecVarG.f28028r = false;
                    ecVarG.j();
                } else if (j10 < 0) {
                    ec ecVarG2 = mcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)).title)));
                    ecVarG2.f28028r = false;
                    ecVarG2.j();
                } else {
                    ec ecVarG3 = mcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    ecVarG3.f28028r = false;
                    ecVarG3.j();
                }
            } else {
                ec ecVarQ = mcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                ecVarQ.f28028r = false;
                ecVarQ.j();
            }
            try {
                e4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
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
