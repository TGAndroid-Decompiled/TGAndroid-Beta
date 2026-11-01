package org.telegram.messenger.voip;

import org.telegram.messenger.is;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f0 implements RequestDelegate {
    public final int f18801a;
    public final VoIPService f18802b;
    public final is f18803c;

    public f0(VoIPService voIPService, is isVar, int i10) {
        this.f18801a = i10;
        this.f18802b = voIPService;
        this.f18803c = isVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18801a) {
            case 0:
                this.f18802b.lambda$acceptIncomingCall$103(this.f18803c, tLObject, tL_error);
                return;
            default:
                this.f18802b.lambda$startOutgoingCall$11(this.f18803c, tLObject, tL_error);
                return;
        }
    }
}
