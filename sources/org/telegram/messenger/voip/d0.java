package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19572a;
    public final VoIPService f19573b;
    public final MessagesStorage f19574c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19572a = i10;
        this.f19573b = voIPService;
        this.f19574c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19572a) {
            case 0:
                this.f19573b.lambda$acceptIncomingCall$103(this.f19574c, tLObject, tL_error);
                return;
            default:
                this.f19573b.lambda$startOutgoingCall$11(this.f19574c, tLObject, tL_error);
                return;
        }
    }
}
