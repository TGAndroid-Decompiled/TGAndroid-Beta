package ih;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
public final class u2 extends dq0 {
    public final org.telegram.ui.ActionBar.o2 X0;
    public final gr0 Y0;

    public u2(gr0 gr0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.Y0 = gr0Var;
        this.X0 = o2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        tc a02;
        String str;
        if (z10 && (a02 = tc.a0(this.X0)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    mc G = a02.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedToSavedMessages, new Object[0])));
                    G.f30660r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                    int i11 = R.raw.forward;
                    int i12 = R.string.GiftCollectionSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    mc G2 = a02.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f30660r = false;
                    G2.j();
                } else {
                    mc G3 = a02.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCollectionSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f30660r = false;
                    G3.j();
                }
            } else {
                mc Q = a02.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCollectionSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.f30660r = false;
                Q.j();
            }
            try {
                this.Y0.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
