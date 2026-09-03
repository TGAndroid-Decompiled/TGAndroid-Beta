package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f18841a;
    public final VoIPService f18842b;
    public final MessagesStorage f18843c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f18841a = i10;
        this.f18842b = voIPService;
        this.f18843c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18841a) {
            case 0:
                this.f18842b.lambda$acceptIncomingCall$103(this.f18843c, tLObject, tL_error);
                return;
            default:
                this.f18842b.lambda$startOutgoingCall$11(this.f18843c, tLObject, tL_error);
                return;
        }
    }
}
