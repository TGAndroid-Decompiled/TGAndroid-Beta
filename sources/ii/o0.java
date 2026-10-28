package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class o0 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(MessagesController.CommunityPeerDialog communityPeerDialog, j0 j0Var) {
        long j10;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            u61 K = u61.K(o0.class);
            long j11 = user.f22177id;
            K.B = j11;
            K.d = (int) (j11 ^ (j11 >>> 32));
            K.G = user;
            K.H = j0Var;
            return K;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        u61 K2 = u61.K(o0.class);
        if (chat != null) {
            j10 = -chat.f22028id;
        } else {
            j10 = 0;
        }
        K2.B = j10;
        K2.d = (int) (j10 ^ (j10 >>> 32));
        K2.G = chat;
        K2.H = j0Var;
        return K2;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        p2 p2Var = (p2) view;
        p2Var.setDialogCellDelegate((l2) u61Var.H);
        Object obj = u61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            p2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f22028id);
            if (dialog != null) {
                z11 = false;
            }
            p2Var.P0 = z11;
            if (dialog != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.W(dialog, 0, 0);
                return;
            }
            p2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            p2Var.V(-chat.f22028id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            p2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f22177id);
            if (dialog2 != null) {
                z11 = false;
            }
            p2Var.P0 = z11;
            if (dialog2 != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.W(dialog2, 0, 0);
                return;
            }
            p2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            p2Var.V(user.f22177id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        p2 p2Var = new p2(null, context, false, i10, u6Var);
        p2Var.O0 = true;
        return p2Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }
}
