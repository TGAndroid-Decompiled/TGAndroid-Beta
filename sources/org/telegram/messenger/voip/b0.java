package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19829a;
    public final VoIPService f19830b;
    public final MessagesStorage f19831c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19829a = i10;
        this.f19830b = voIPService;
        this.f19831c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19829a) {
            case 0:
                this.f19830b.lambda$acceptIncomingCall$103(this.f19831c, tLObject, tL_error);
                return;
            default:
                this.f19830b.lambda$startOutgoingCall$11(this.f19831c, tLObject, tL_error);
                return;
        }
    }
}
