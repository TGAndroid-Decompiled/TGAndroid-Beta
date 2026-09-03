package mh;

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
public final class j3 extends lq0 {
    public final g5 Y0;

    public j3(g5 g5Var, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, g6Var);
        this.Y0 = g5Var;
        this.X = true;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        qc bulletinFactory;
        String str;
        if (z4 && (bulletinFactory = getBulletinFactory()) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    ic G = bulletinFactory.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                    G.f27786r = false;
                    G.f27788t = true;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                    int i11 = R.raw.forward;
                    int i12 = R.string.LinkSharedTo;
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = chat.title;
                    }
                    ic G2 = bulletinFactory.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    G2.f27786r = false;
                    G2.f27788t = true;
                    G2.j();
                } else {
                    ic G3 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.f27786r = false;
                    G3.f27788t = true;
                    G3.j();
                }
            } else {
                ic Q = bulletinFactory.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.f27786r = false;
                Q.f27788t = true;
                Q.j();
            }
            try {
                this.container.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void S0(View view) {
        g5.k1(this.Y0, view);
    }
}
