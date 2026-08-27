package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wq0;

public final class a3 extends sp0 {
    public final org.telegram.ui.ActionBar.n2 X0;
    public final wq0 Y0;

    public a3(wq0 wq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.Y0 = wq0Var;
        this.X0 = n2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        mc mcVarA0;
        if (z10 && (mcVarA0 = mc.a0(this.X0)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    ec ecVarG = mcVarA0.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    ecVarG.f28028r = false;
                    ecVarG.j();
                } else if (j10 < 0) {
                    ec ecVarG2 = mcVarA0.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)).title)));
                    ecVarG2.f28028r = false;
                    ecVarG2.j();
                } else {
                    ec ecVarG3 = mcVarA0.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    ecVarG3.f28028r = false;
                    ecVarG3.j();
                }
            } else {
                ec ecVarQ = mcVarA0.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                ecVarQ.f28028r = false;
                ecVarQ.j();
            }
            try {
                this.Y0.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
