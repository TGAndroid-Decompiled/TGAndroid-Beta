package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17914a;
    public final VoIPService f17915b;
    public final MessagesStorage f17916c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17914a = i10;
        this.f17915b = voIPService;
        this.f17916c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17914a) {
            case 0:
                this.f17915b.lambda$acceptIncomingCall$103(this.f17916c, tLObject, tL_error);
                return;
            default:
                this.f17915b.lambda$startOutgoingCall$11(this.f17916c, tLObject, tL_error);
                return;
        }
    }
}
