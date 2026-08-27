package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class n0 extends m41 {
    static {
        m41.setup(new n0());
    }

    public static n41 a(MessagesController.CommunityPeerDialog communityPeerDialog, j0 j0Var) {
        TLRPC.User user = communityPeerDialog.user;
        if (user != null) {
            n41 n41VarJ = n41.J(n0.class);
            long j10 = user.f22527id;
            n41VarJ.B = j10;
            n41VarJ.d = (int) (j10 ^ (j10 >>> 32));
            n41VarJ.G = user;
            n41VarJ.H = j0Var;
            return n41VarJ;
        }
        TLRPC.Chat chat = communityPeerDialog.chat;
        n41 n41VarJ2 = n41.J(n0.class);
        long j11 = chat != null ? -chat.f22380id : 0L;
        n41VarJ2.B = j11;
        n41VarJ2.d = (int) (j11 ^ (j11 >>> 32));
        n41VarJ2.G = chat;
        n41VarJ2.H = j0Var;
        return n41VarJ2;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        p2 p2Var = (p2) view;
        p2Var.setDialogCellDelegate((l2) n41Var.H);
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, chat);
            TLRPC.Dialog dialog = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(-chat.f22380id);
            p2Var.L0 = dialog == null;
            if (dialog != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog, 0, 0);
                return;
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]));
                p2Var.W(-chat.f22380id, null, 0, false, false);
                return;
            }
        }
        if (obj instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) obj;
            p2Var.M0 = ChatObject.isHiddenInCommunity(UserConfig.selectedAccount, user);
            TLRPC.Dialog dialog2 = MessagesController.getInstance(UserConfig.selectedAccount).getDialog(user.f22527id);
            p2Var.L0 = dialog2 == null;
            if (dialog2 != null) {
                p2Var.setCustomMessageWithoutRebuild(null);
                p2Var.X(dialog2, 0, 0);
            } else {
                p2Var.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                p2Var.W(user.f22527id, null, 0, false, false);
            }
        }
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        p2 p2Var = new p2(null, context, false, i10, c6Var);
        p2Var.K0 = true;
        return p2Var;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }
}
