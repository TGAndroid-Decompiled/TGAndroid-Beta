package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class z3 extends jr0 {
    public final q5 f4059b1;

    public z3(q5 q5Var, Context context, String str, String str2, boolean z10, n3 n3Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, n3Var);
        this.f4059b1 = q5Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        q5 q5Var = this.f4059b1;
        zc zcVar = new zc(q5Var.f3511c1, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                sc G = zcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f29110r = false;
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
                sc G2 = zcVar.G(i11, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                G2.f29110r = false;
                G2.j();
            } else {
                sc G3 = zcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f29110r = false;
                G3.j();
            }
        } else {
            sc Q = zcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f29110r = false;
            Q.j();
        }
        try {
            q5Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void T0(View view) {
        this.f4059b1.e1();
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        this.f4059b1.Z2 = null;
    }
}
