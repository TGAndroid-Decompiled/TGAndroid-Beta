package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t57 implements RequestDelegate {
    public final byte a;
    public final na7 b;
    public final long c;
    public final long d;

    public t57(na7 na7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        switch (b) {
            case 0:
                na7 na7Var = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    na7Var.N3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, j2);
                }
                if (j != 0) {
                    na7Var.getMessagesStorage().n1(j);
                    return;
                }
                return;
            default:
                na7 na7Var2 = this.b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        na7Var2.L3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, na7Var2.D4, false, false, false);
                    }
                }
                if (j2 != 0) {
                    na7Var2.getMessagesStorage().n1(j2);
                }
                na7Var2.T0.e(j);
                return;
        }
    }
}
