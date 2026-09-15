package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17728a;
    public final VoIPService f17729b;
    public final MessagesStorage f17730c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17728a = i10;
        this.f17729b = voIPService;
        this.f17730c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17728a) {
            case 0:
                this.f17729b.lambda$acceptIncomingCall$103(this.f17730c, tLObject, tL_error);
                return;
            default:
                this.f17729b.lambda$startOutgoingCall$11(this.f17730c, tLObject, tL_error);
                return;
        }
    }
}
