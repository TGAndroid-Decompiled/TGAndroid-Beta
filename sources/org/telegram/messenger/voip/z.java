package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements RequestDelegate {
    public final int f19482a;
    public final VoIPService f19483b;
    public final MessagesStorage f19484c;

    public z(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19482a = i10;
        this.f19483b = voIPService;
        this.f19484c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19482a) {
            case 0:
                this.f19483b.lambda$acceptIncomingCall$103(this.f19484c, tLObject, tL_error);
                return;
            default:
                this.f19483b.lambda$startOutgoingCall$11(this.f19484c, tLObject, tL_error);
                return;
        }
    }
}
