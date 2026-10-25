package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f21613a;
    public final VoIPService f21614b;
    public final MessagesStorage f21615c;

    public a0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f21613a = i10;
        this.f21614b = voIPService;
        this.f21615c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21613a) {
            case 0:
                this.f21614b.lambda$acceptIncomingCall$103(this.f21615c, tLObject, tL_error);
                return;
            default:
                this.f21614b.lambda$startOutgoingCall$11(this.f21615c, tLObject, tL_error);
                return;
        }
    }
}
