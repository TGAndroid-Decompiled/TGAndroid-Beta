package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class q0 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            m61 J = m61.J(q0.class);
            long j11 = user.f19063id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        m61 J2 = m61.J(q0.class);
        if (chat != null) {
            j10 = -chat.f18916id;
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
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) m61Var.H);
        Object obj = m61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f18916id);
            if (dialog != null) {
                z11 = false;
            }
            s2Var.P0 = z11;
            if (dialog != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog, 0, 0);
                return;
            }
            s2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            s2Var.W(-chat.f18916id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f19063id);
            if (dialog2 != null) {
                z11 = false;
            }
            s2Var.P0 = z11;
            if (dialog2 != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.X(dialog2, 0, 0);
                return;
            }
            s2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            s2Var.W(user.f19063id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        s2 s2Var = new s2(null, context, false, i10, c6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }
}
