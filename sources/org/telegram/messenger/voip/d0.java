package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f17885a;
    public final VoIPService f17886b;
    public final MessagesStorage f17887c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f17885a = i10;
        this.f17886b = voIPService;
        this.f17887c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17885a) {
            case 0:
                this.f17886b.lambda$acceptIncomingCall$103(this.f17887c, tLObject, tL_error);
                return;
            default:
                this.f17886b.lambda$startOutgoingCall$11(this.f17887c, tLObject, tL_error);
                return;
        }
    }
}
