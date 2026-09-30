package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17998a;
    public final VoIPService f17999b;
    public final MessagesStorage f18000c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17998a = i10;
        this.f17999b = voIPService;
        this.f18000c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17998a) {
            case 0:
                this.f17999b.lambda$acceptIncomingCall$103(this.f18000c, tLObject, tL_error);
                return;
            default:
                this.f17999b.lambda$startOutgoingCall$11(this.f18000c, tLObject, tL_error);
                return;
        }
    }
}
