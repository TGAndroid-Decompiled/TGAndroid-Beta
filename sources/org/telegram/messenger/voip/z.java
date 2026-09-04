package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19441a;
    public final VoIPService f19442b;
    public final MessagesStorage f19443c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19441a = i10;
        this.f19442b = voIPService;
        this.f19443c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19441a) {
            case 0:
                this.f19442b.lambda$acceptIncomingCall$103(this.f19443c, tLObject, tL_error);
                return;
            default:
                this.f19442b.lambda$startOutgoingCall$11(this.f19443c, tLObject, tL_error);
                return;
        }
    }
}
