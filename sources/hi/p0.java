package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class p0 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            g61 J = g61.J(p0.class);
            long j11 = user.f20420id;
            J.B = j11;
            J.d = (int) (j11 ^ (j11 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        g61 J2 = g61.J(p0.class);
        if (chat != null) {
            j10 = -chat.f20273id;
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
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        r2 r2Var = (r2) view;
        r2Var.setDialogCellDelegate((n2) g61Var.H);
        Object obj = g61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f20273id);
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
            r2Var.W(-chat.f20273id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            r2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f20420id);
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
            r2Var.W(user.f20420id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        r2 r2Var = new r2(null, context, false, i10, d6Var);
        r2Var.O0 = true;
        return r2Var;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }
}
