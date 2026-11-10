package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk implements RequestDelegate {
    public final int f24581a;
    public final qp f24582b;
    public final long f24583c;
    public final long d;

    public pk(int i7, long j3, long j10, qp qpVar) {
        this.f24581a = i7;
        this.f24582b = qpVar;
        this.f24583c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24581a) {
            case 0:
                qp qpVar = this.f24582b;
                qpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qpVar.L3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f24583c);
                }
                long j3 = this.d;
                if (j3 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                    return;
                }
                return;
            default:
                qp qpVar2 = this.f24582b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        qpVar2.J3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, qpVar2.P7, false, false, false);
                    }
                }
                long j10 = this.f24583c;
                if (j10 != 0) {
                    qpVar2.getMessagesStorage().q1(j10);
                }
                qpVar2.f24754c1.e(this.d);
                return;
        }
    }
}
