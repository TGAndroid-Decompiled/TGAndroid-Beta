package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f24854a;
    public final rd f24855b;

    public jd(rd rdVar, int i7) {
        this.f24854a = i7;
        this.f24855b = rdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24854a) {
            case 0:
                rd rdVar = this.f24855b;
                if (tL_error != null) {
                    rdVar.getClass();
                    return;
                } else {
                    rdVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                rd rdVar2 = this.f24855b;
                if (tL_error != null) {
                    rdVar2.getClass();
                    return;
                } else {
                    rdVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                rd rdVar3 = this.f24855b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    rdVar3.getMessagesController().T3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                rdVar3.getClass();
                return;
        }
    }
}
