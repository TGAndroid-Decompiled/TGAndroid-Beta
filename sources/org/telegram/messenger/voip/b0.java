package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19832a;
    public final VoIPService f19833b;
    public final MessagesStorage f19834c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19832a = i10;
        this.f19833b = voIPService;
        this.f19834c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19832a) {
            case 0:
                this.f19833b.lambda$acceptIncomingCall$103(this.f19834c, tLObject, tL_error);
                return;
            default:
                this.f19833b.lambda$startOutgoingCall$11(this.f19834c, tLObject, tL_error);
                return;
        }
    }
}
