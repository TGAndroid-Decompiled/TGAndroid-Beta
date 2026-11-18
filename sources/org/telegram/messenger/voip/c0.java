package org.telegram.messenger.voip;

import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27473a;
    public final VoIPService f27474b;
    public final tr f27475c;

    public c0(VoIPService voIPService, tr trVar, int i7) {
        this.f27473a = i7;
        this.f27474b = voIPService;
        this.f27475c = trVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27473a) {
            case 0:
                this.f27474b.lambda$acceptIncomingCall$103(this.f27475c, tLObject, tL_error);
                return;
            default:
                this.f27474b.lambda$startOutgoingCall$11(this.f27475c, tLObject, tL_error);
                return;
        }
    }
}
