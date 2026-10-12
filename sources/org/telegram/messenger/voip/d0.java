package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements RequestDelegate {
    public final int f19312a;
    public final VoIPService f19313b;
    public final MessagesStorage f19314c;

    public d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f19312a = i10;
        this.f19313b = voIPService;
        this.f19314c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19312a) {
            case 0:
                this.f19313b.lambda$acceptIncomingCall$103(this.f19314c, tLObject, tL_error);
                return;
            default:
                this.f19313b.lambda$startOutgoingCall$11(this.f19314c, tLObject, tL_error);
                return;
        }
    }
}
