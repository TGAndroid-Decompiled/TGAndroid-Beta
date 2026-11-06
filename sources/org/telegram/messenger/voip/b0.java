package org.telegram.messenger.voip;

import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f26089a;
    public final VoIPService f26090b;
    public final yr f26091c;

    public b0(VoIPService voIPService, yr yrVar, int i7) {
        this.f26089a = i7;
        this.f26090b = voIPService;
        this.f26091c = yrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26089a) {
            case 0:
                this.f26090b.lambda$acceptIncomingCall$103(this.f26091c, tLObject, tL_error);
                return;
            default:
                this.f26090b.lambda$startOutgoingCall$11(this.f26091c, tLObject, tL_error);
                return;
        }
    }
}
