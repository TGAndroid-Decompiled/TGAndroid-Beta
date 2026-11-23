package org.telegram.messenger.voip;

import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27428a;
    public final VoIPService f27429b;
    public final ur f27430c;

    public c0(VoIPService voIPService, ur urVar, int i7) {
        this.f27428a = i7;
        this.f27429b = voIPService;
        this.f27430c = urVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27428a) {
            case 0:
                this.f27429b.lambda$acceptIncomingCall$103(this.f27430c, tLObject, tL_error);
                return;
            default:
                this.f27429b.lambda$startOutgoingCall$11(this.f27430c, tLObject, tL_error);
                return;
        }
    }
}
