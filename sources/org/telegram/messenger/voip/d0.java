package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19313a;
    public final VoIPService f19314b;
    public final MessagesStorage f19315c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19313a = i10;
        this.f19314b = voIPService;
        this.f19315c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19313a) {
            case 0:
                this.f19314b.lambda$acceptIncomingCall$103(this.f19315c, tLObject, tL_error);
                return;
            default:
                this.f19314b.lambda$startOutgoingCall$11(this.f19315c, tLObject, tL_error);
                return;
        }
    }
}
