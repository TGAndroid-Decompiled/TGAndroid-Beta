package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19918a;
    public final VoIPService f19919b;
    public final MessagesStorage f19920c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19918a = i10;
        this.f19919b = voIPService;
        this.f19920c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19918a) {
            case 0:
                this.f19919b.lambda$acceptIncomingCall$103(this.f19920c, tLObject, tL_error);
                return;
            default:
                this.f19919b.lambda$startOutgoingCall$11(this.f19920c, tLObject, tL_error);
                return;
        }
    }
}
