package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17982a;
    public final VoIPService f17983b;
    public final MessagesStorage f17984c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17982a = i10;
        this.f17983b = voIPService;
        this.f17984c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17982a) {
            case 0:
                this.f17983b.lambda$acceptIncomingCall$103(this.f17984c, tLObject, tL_error);
                return;
            default:
                this.f17983b.lambda$startOutgoingCall$11(this.f17984c, tLObject, tL_error);
                return;
        }
    }
}
