package lh;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;

public final class r8 extends yk0 {

    public final s8 f16676c;

    public r8(s8 s8Var) {
        this.f16676c = s8Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 2;
    }

    @Override
    public final int h() {
        return this.f16676c.f16735c.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        s8 s8Var = this.f16676c;
        int i11 = s8Var.f16734b;
        if (o1Var.f5793f == 2) {
            p9 p9Var = (p9) o1Var.f5789a;
            p9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) s8Var.f16735c.get(i10 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                p9Var.setUser(UserConfig.getInstance(i11).getCurrentUser());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                p9Var.setUser(MessagesController.getInstance(i11).getUser(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                p9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                p9Var.a(0, MessagesController.getInstance(i11).getChat(Long.valueOf(inputPeer.channel_id)));
            }
            p9Var.f16540f.setVisibility(8);
            p9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = s8Var.d;
            if (inputPeer2 == null && i10 == 2) {
                z10 = true;
            } else {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? UserConfig.getInstance(s8Var.f16734b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2)) == (z11 ? UserConfig.getInstance(s8Var.f16734b).getClientUserId() : DialogObject.getPeerDialogId(inputPeer))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            p9Var.c(z10, false);
            p9Var.setDivider(i10 != h() - 1);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View p9Var;
        s8 s8Var = this.f16676c;
        if (i10 == 0 || i10 == 1) {
            View view = new View(s8Var.getContext());
            view.setLayoutParams(new f2.y0(-1, i10 == 0 ? (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(306.0f) : AndroidUtilities.dp(54.0f)));
            p9Var = view;
        } else {
            p9Var = new p9(s8Var.getContext(), ((org.telegram.ui.ActionBar.e3) s8Var).resourcesProvider);
        }
        return new lk0(p9Var);
    }
}
