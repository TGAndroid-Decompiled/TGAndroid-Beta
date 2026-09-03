package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f20496a;
    public final VoIPService f20497b;
    public final MessagesStorage f20498c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f20496a = i10;
        this.f20497b = voIPService;
        this.f20498c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20496a) {
            case 0:
                this.f20497b.lambda$acceptIncomingCall$103(this.f20498c, tLObject, tL_error);
                return;
            default:
                this.f20497b.lambda$startOutgoingCall$11(this.f20498c, tLObject, tL_error);
                return;
        }
    }
}
