package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class q0 extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(MessagesController.CommunityPeerDialog communityPeerDialog, k0 k0Var) {
        long j3;
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            q61 J = q61.J(q0.class);
            long j10 = user.f20189id;
            J.B = j10;
            J.d = (int) (j10 ^ (j10 >>> 32));
            J.G = user;
            J.H = k0Var;
            return J;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        q61 J2 = q61.J(q0.class);
        if (chat != null) {
            j3 = -chat.f20042id;
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
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        s2 s2Var = (s2) view;
        s2Var.setDialogCellDelegate((o2) q61Var.H);
        Object obj = q61Var.G;
        boolean z11 = true;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f20042id);
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
            s2Var.W(-chat.f20042id, null, 0, false, false);
        } else if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            s2Var.Q0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f20189id);
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
            s2Var.W(user.f20189id, null, 0, false, false);
        }
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        s2 s2Var = new s2(null, context, false, i10, e6Var);
        s2Var.O0 = true;
        return s2Var;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }
}
