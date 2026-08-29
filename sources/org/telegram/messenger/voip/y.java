package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y implements RequestDelegate {
    public final int f22031a;
    public final VoIPService f22032b;
    public final MessagesStorage f22033c;

    public y(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f22031a = i10;
        this.f22032b = voIPService;
        this.f22033c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22031a) {
            case 0:
                this.f22032b.lambda$acceptIncomingCall$103(this.f22033c, tLObject, tL_error);
                return;
            default:
                this.f22032b.lambda$startOutgoingCall$11(this.f22033c, tLObject, tL_error);
                return;
        }
    }
}
