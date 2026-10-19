package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f19835a;
    public final VoIPService f19836b;
    public final MessagesStorage f19837c;

    public b0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19835a = i10;
        this.f19836b = voIPService;
        this.f19837c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19835a) {
            case 0:
                this.f19836b.lambda$acceptIncomingCall$103(this.f19837c, tLObject, tL_error);
                return;
            default:
                this.f19836b.lambda$startOutgoingCall$11(this.f19837c, tLObject, tL_error);
                return;
        }
    }
}
