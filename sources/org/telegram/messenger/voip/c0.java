package org.telegram.messenger.voip;

import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27569a;
    public final VoIPService f27570b;
    public final tr f27571c;

    public c0(VoIPService voIPService, tr trVar, int i7) {
        this.f27569a = i7;
        this.f27570b = voIPService;
        this.f27571c = trVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27569a) {
            case 0:
                this.f27570b.lambda$acceptIncomingCall$103(this.f27571c, tLObject, tL_error);
                return;
            default:
                this.f27570b.lambda$startOutgoingCall$11(this.f27571c, tLObject, tL_error);
                return;
        }
    }
}
