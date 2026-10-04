package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19533a;
    public final VoIPService f19534b;
    public final MessagesStorage f19535c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19533a = i10;
        this.f19534b = voIPService;
        this.f19535c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19533a) {
            case 0:
                this.f19534b.lambda$acceptIncomingCall$103(this.f19535c, tLObject, tL_error);
                return;
            default:
                this.f19534b.lambda$startOutgoingCall$11(this.f19535c, tLObject, tL_error);
                return;
        }
    }
}
