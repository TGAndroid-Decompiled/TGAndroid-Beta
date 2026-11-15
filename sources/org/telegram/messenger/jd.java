package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jd implements RequestDelegate {
    public final int f24549a;
    public final rd f24550b;

    public jd(rd rdVar, int i7) {
        this.f24549a = i7;
        this.f24550b = rdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24549a) {
            case 0:
                rd rdVar = this.f24550b;
                if (tL_error != null) {
                    rdVar.getClass();
                    return;
                } else {
                    rdVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                rd rdVar2 = this.f24550b;
                if (tL_error != null) {
                    rdVar2.getClass();
                    return;
                } else {
                    rdVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                rd rdVar3 = this.f24550b;
                if (z10) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    rdVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                rdVar3.getClass();
                return;
        }
    }
}
