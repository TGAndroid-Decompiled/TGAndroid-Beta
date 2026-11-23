package org.telegram.messenger.voip;

import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27464a;
    public final VoIPService f27465b;
    public final ur f27466c;

    public c0(VoIPService voIPService, ur urVar, int i7) {
        this.f27464a = i7;
        this.f27465b = voIPService;
        this.f27466c = urVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27464a) {
            case 0:
                this.f27465b.lambda$acceptIncomingCall$103(this.f27466c, tLObject, tL_error);
                return;
            default:
                this.f27465b.lambda$startOutgoingCall$11(this.f27466c, tLObject, tL_error);
                return;
        }
    }
}
