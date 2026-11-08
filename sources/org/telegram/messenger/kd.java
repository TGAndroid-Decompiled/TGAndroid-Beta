package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kd implements RequestDelegate {
    public final int f23680a;
    public final sd f23681b;

    public kd(sd sdVar, int i7) {
        this.f23680a = i7;
        this.f23681b = sdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23680a) {
            case 0:
                sd sdVar = this.f23681b;
                if (tL_error != null) {
                    sdVar.getClass();
                    return;
                } else {
                    sdVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            case 1:
                sd sdVar2 = this.f23681b;
                if (tL_error != null) {
                    sdVar2.getClass();
                    return;
                } else {
                    sdVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                }
            default:
                boolean z9 = tLObject instanceof TLRPC.TL_messages_affectedMessages;
                sd sdVar3 = this.f23681b;
                if (z9) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    sdVar3.getMessagesController().M3(tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
                    return;
                }
                sdVar3.getClass();
                return;
        }
    }
}
