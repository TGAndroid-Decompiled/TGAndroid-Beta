package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.rp0;
public final class x2 extends rp0 {
    public final i4 X0;

    public x2(i4 i4Var, Context context, String str, String str2, boolean z10, n2 n2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, n2Var);
        this.X0 = i4Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        i4 i4Var = this.X0;
        oc ocVar = new oc(i4Var.Y0, this.resourcesProvider);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                gc G = ocVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                G.f28745r = false;
                G.j();
            } else if (j10 < 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
                int i10 = R.raw.forward;
                int i11 = R.string.StorySharedTo;
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = chat.title;
                }
                gc G2 = ocVar.G(i10, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(i11, str)));
                G2.f28745r = false;
                G2.j();
            } else {
                gc G3 = ocVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                G3.f28745r = false;
                G3.j();
            }
        } else {
            gc Q = ocVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
            Q.f28745r = false;
            Q.j();
        }
        try {
            i4Var.performHapticFeedback(3);
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
