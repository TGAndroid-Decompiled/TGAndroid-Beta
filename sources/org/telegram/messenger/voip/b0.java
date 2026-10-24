package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19913a;
    public final VoIPService f19914b;
    public final MessagesStorage f19915c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19913a = i10;
        this.f19914b = voIPService;
        this.f19915c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19913a) {
            case 0:
                this.f19914b.lambda$acceptIncomingCall$103(this.f19915c, tLObject, tL_error);
                return;
            default:
                this.f19914b.lambda$startOutgoingCall$11(this.f19915c, tLObject, tL_error);
                return;
        }
    }
}
