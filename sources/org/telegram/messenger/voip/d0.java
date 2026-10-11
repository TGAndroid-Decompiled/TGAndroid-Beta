package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19536a;
    public final VoIPService f19537b;
    public final MessagesStorage f19538c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19536a = i10;
        this.f19537b = voIPService;
        this.f19538c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19536a) {
            case 0:
                this.f19537b.lambda$acceptIncomingCall$103(this.f19538c, tLObject, tL_error);
                return;
            default:
                this.f19537b.lambda$startOutgoingCall$11(this.f19538c, tLObject, tL_error);
                return;
        }
    }
}
