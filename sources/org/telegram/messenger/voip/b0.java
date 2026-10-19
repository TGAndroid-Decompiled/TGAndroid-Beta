package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19838a;
    public final VoIPService f19839b;
    public final MessagesStorage f19840c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19838a = i10;
        this.f19839b = voIPService;
        this.f19840c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19838a) {
            case 0:
                this.f19839b.lambda$acceptIncomingCall$103(this.f19840c, tLObject, tL_error);
                return;
            default:
                this.f19839b.lambda$startOutgoingCall$11(this.f19840c, tLObject, tL_error);
                return;
        }
    }
}
