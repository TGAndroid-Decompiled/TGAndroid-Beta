package org.telegram.messenger.voip;

import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f26095a;
    public final VoIPService f26096b;
    public final yr f26097c;

    public b0(VoIPService voIPService, yr yrVar, int i7) {
        this.f26095a = i7;
        this.f26096b = voIPService;
        this.f26097c = yrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26095a) {
            case 0:
                this.f26096b.lambda$acceptIncomingCall$103(this.f26097c, tLObject, tL_error);
                return;
            default:
                this.f26096b.lambda$startOutgoingCall$11(this.f26097c, tLObject, tL_error);
                return;
        }
    }
}
