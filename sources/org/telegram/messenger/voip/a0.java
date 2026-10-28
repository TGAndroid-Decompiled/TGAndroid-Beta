package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements RequestDelegate {
    public final int f21601a;
    public final VoIPService f21602b;
    public final MessagesStorage f21603c;

    public a0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f21601a = i10;
        this.f21602b = voIPService;
        this.f21603c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21601a) {
            case 0:
                this.f21602b.lambda$acceptIncomingCall$103(this.f21603c, tLObject, tL_error);
                return;
            default:
                this.f21602b.lambda$startOutgoingCall$11(this.f21603c, tLObject, tL_error);
                return;
        }
    }
}
