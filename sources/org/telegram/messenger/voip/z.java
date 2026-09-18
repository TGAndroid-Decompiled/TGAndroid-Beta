package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17737a;
    public final VoIPService f17738b;
    public final MessagesStorage f17739c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17737a = i10;
        this.f17738b = voIPService;
        this.f17739c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17737a) {
            case 0:
                this.f17738b.lambda$acceptIncomingCall$103(this.f17739c, tLObject, tL_error);
                return;
            default:
                this.f17738b.lambda$startOutgoingCall$11(this.f17739c, tLObject, tL_error);
                return;
        }
    }
}
