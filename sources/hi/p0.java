package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class p0 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            l61 J = l61.J(p0.class);
            long j11 = user.f20491id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        l61 J2 = l61.J(p0.class);
        if (chat != null) {
            j10 = -chat.f20344id;
        } else {
            j10 = 0;
        }
        J2.B = j10;
        J2.d = (int) (j10 ^ (j10 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        q2 q2Var = (q2) view;
        q2Var.setDialogCellDelegate((m2) l61Var.H);
        Object obj = l61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            q2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f20344id);
            if (dialog != null) {
                z11 = false;
            }
            q2Var.P0 = z11;
            if (dialog != null) {
                q2Var.setCustomMessageWithoutRebuild(null);
                q2Var.W(dialog, 0, 0);
                return;
            }
            q2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            q2Var.V(-chat.f20344id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            q2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f20491id);
            if (dialog2 != null) {
                z11 = false;
            }
            q2Var.P0 = z11;
            if (dialog2 != null) {
                q2Var.setCustomMessageWithoutRebuild(null);
                q2Var.W(dialog2, 0, 0);
                return;
            }
            q2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            q2Var.V(user.f20491id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        q2 q2Var = new q2(null, context, false, i10, g6Var);
        q2Var.O0 = true;
        return q2Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
