package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 implements RequestDelegate {
    public final int f19550a;
    public final VoIPService f19551b;
    public final MessagesStorage f19552c;

    public e0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19550a = i10;
        this.f19551b = voIPService;
        this.f19552c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19550a) {
            case 0:
                this.f19551b.lambda$acceptIncomingCall$103(this.f19552c, tLObject, tL_error);
                return;
            default:
                this.f19551b.lambda$startOutgoingCall$11(this.f19552c, tLObject, tL_error);
                return;
        }
    }
}
