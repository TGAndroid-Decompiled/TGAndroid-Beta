package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19850a;
    public final VoIPService f19851b;
    public final MessagesStorage f19852c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19850a = i10;
        this.f19851b = voIPService;
        this.f19852c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19850a) {
            case 0:
                this.f19851b.lambda$acceptIncomingCall$103(this.f19852c, tLObject, tL_error);
                return;
            default:
                this.f19851b.lambda$startOutgoingCall$11(this.f19852c, tLObject, tL_error);
                return;
        }
    }
}
