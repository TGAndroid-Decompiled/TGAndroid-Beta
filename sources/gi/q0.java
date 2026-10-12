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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class q0 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            l61 J = l61.J(q0.class);
            long j11 = user.f19363id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        l61 J2 = l61.J(q0.class);
        if (chat != null) {
            j10 = -chat.f19216id;
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
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) l61Var.H);
        Object obj = l61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f19216id);
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
            s2Var.W(-chat.f19216id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f19363id);
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
            s2Var.W(user.f19363id, null, 0, false, false);
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        s2 s2Var = new s2(null, context, false, i10, c6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
