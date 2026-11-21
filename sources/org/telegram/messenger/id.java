package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class id implements RequestDelegate {
    public final int f24683a;
    public final qd f24684b;

    public id(qd qdVar, int i7) {
        this.f24683a = i7;
        this.f24684b = qdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24683a) {
            case 0:
                qd qdVar = this.f24684b;
                if (tL_error != null) {
                    qdVar.getClass();
                    return;
                } else {
                    qdVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                qd qdVar2 = this.f24684b;
                if (tL_error != null) {
                    qdVar2.getClass();
                    return;
                } else {
                    qdVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                qd qdVar3 = this.f24684b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    qdVar3.getMessagesController().T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                qdVar3.getClass();
                return;
        }
    }
}
