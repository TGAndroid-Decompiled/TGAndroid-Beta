package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kh6 implements e39, ed {
    public final yh6 a;

    public kh6(yh6 yh6Var) {
        this.a = yh6Var;
    }

    @Override
    public final boolean d(int i, View view) {
        yh6 yh6Var = this.a;
        if ((i < yh6Var.E || i >= yh6Var.F) && (i < yh6Var.I || i >= yh6Var.J)) {
            return false;
        }
        ((vh6) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        yh6 yh6Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = yh6Var.getMessagesController().h1(-yh6Var.n);
        long j = yh6Var.f;
        if (j == yh6Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh6Var.getMessagesController().o1(yh6Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = yh6Var.getMessagesController().m1(j);
        }
        yh6Var.d0 = true;
        yh6Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new hh6(yh6Var, (byte) 1));
    }
}
