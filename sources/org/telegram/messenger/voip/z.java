package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f17981a;
    public final VoIPService f17982b;
    public final MessagesStorage f17983c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17981a = i10;
        this.f17982b = voIPService;
        this.f17983c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17981a) {
            case 0:
                this.f17982b.lambda$acceptIncomingCall$103(this.f17983c, tLObject, tL_error);
                return;
            default:
                this.f17982b.lambda$startOutgoingCall$11(this.f17983c, tLObject, tL_error);
                return;
        }
    }
}
