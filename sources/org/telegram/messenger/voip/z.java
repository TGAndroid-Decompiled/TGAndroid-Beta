package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17965a;
    public final VoIPService f17966b;
    public final MessagesStorage f17967c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17965a = i10;
        this.f17966b = voIPService;
        this.f17967c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17965a) {
            case 0:
                this.f17966b.lambda$acceptIncomingCall$103(this.f17967c, tLObject, tL_error);
                return;
            default:
                this.f17966b.lambda$startOutgoingCall$11(this.f17967c, tLObject, tL_error);
                return;
        }
    }
}
