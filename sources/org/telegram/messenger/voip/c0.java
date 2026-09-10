package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f16701a;
    public final VoIPService f16702b;
    public final MessagesStorage f16703c;

    public c0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.f16701a = i10;
        this.f16702b = voIPService;
        this.f16703c = messagesStorage;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16701a) {
            case 0:
                this.f16702b.lambda$acceptIncomingCall$103(this.f16703c, tLObject, tL_error);
                return;
            default:
                this.f16702b.lambda$startOutgoingCall$11(this.f16703c, tLObject, tL_error);
                return;
        }
    }
}
