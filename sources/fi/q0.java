package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class q0 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j3;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            h61 K = h61.K(q0.class);
            long j10 = user.f20194id;
            K.B = j10;
            K.d = (int) (j10 ^ (j10 >>> 32));
            K.G = user;
            K.H = k0Var;
            return K;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        h61 K2 = h61.K(q0.class);
        if (chat != null) {
            j3 = -chat.f20047id;
        } else {
            j3 = 0;
        }
        K2.B = j3;
        K2.d = (int) (j3 ^ (j3 >>> 32));
        K2.G = chat;
        K2.H = k0Var;
        return K2;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) h61Var.H);
        Object obj = h61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f20047id);
            if (dialog != null) {
                z11 = false;
            }
            s2Var.P0 = z11;
            if (dialog != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.W(dialog, 0, 0);
                return;
            }
            s2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
            s2Var.U(-chat.f20047id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f20194id);
            if (dialog2 != null) {
                z11 = false;
            }
            s2Var.P0 = z11;
            if (dialog2 != null) {
                s2Var.setCustomMessageWithoutRebuild(null);
                s2Var.W(dialog2, 0, 0);
                return;
            }
            s2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
            s2Var.U(user.f20194id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        s2 s2Var = new s2(null, context, false, i10, d6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }
}
