package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17967a;
    public final VoIPService f17968b;
    public final MessagesStorage f17969c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17967a = i10;
        this.f17968b = voIPService;
        this.f17969c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17967a) {
            case 0:
                this.f17968b.lambda$acceptIncomingCall$103(this.f17969c, tLObject, tL_error);
                return;
            default:
                this.f17968b.lambda$startOutgoingCall$11(this.f17969c, tLObject, tL_error);
                return;
        }
    }
}
