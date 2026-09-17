package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class q0 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j3;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            h51 J = h51.J(q0.class);
            long j10 = user.f20016id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        h51 J2 = h51.J(q0.class);
        if (chat != null) {
            j3 = -chat.f19869id;
        } else {
            j3 = 0;
        }
        J2.B = j3;
        J2.d = (int) (j3 ^ (j3 >>> 32));
        J2.G = chat;
        J2.H = k0Var;
        return J2;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) h51Var.H);
        Object obj = h51Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f19869id);
            if (dialog != null) {
                z11 = false;
            }
            r2Var.P0 = z11;
            if (dialog != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog, 0, 0);
                return;
            }
            r2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            r2Var.W(-chat.f19869id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f20016id);
            if (dialog2 != null) {
                z11 = false;
            }
            r2Var.P0 = z11;
            if (dialog2 != null) {
                r2Var.setCustomMessageWithoutRebuild(null);
                r2Var.X(dialog2, 0, 0);
                return;
            }
            r2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            r2Var.W(user.f20016id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        r2 r2Var = new r2(null, context, false, i10, f6Var);
        r2Var.O0 = true;
        return r2Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }
}
