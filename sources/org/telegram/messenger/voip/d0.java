package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19531a;
    public final VoIPService f19532b;
    public final MessagesStorage f19533c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19531a = i10;
        this.f19532b = voIPService;
        this.f19533c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19531a) {
            case 0:
                this.f19532b.lambda$acceptIncomingCall$103(this.f19533c, tLObject, tL_error);
                return;
            default:
                this.f19532b.lambda$startOutgoingCall$11(this.f19533c, tLObject, tL_error);
                return;
        }
    }
}
