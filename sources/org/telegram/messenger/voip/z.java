package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17956a;
    public final VoIPService f17957b;
    public final MessagesStorage f17958c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17956a = i10;
        this.f17957b = voIPService;
        this.f17958c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17956a) {
            case 0:
                this.f17957b.lambda$acceptIncomingCall$103(this.f17958c, tLObject, tL_error);
                return;
            default:
                this.f17957b.lambda$startOutgoingCall$11(this.f17958c, tLObject, tL_error);
                return;
        }
    }
}
