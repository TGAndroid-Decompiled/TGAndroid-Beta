package org.telegram.messenger.voip;

import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f26081a;
    public final VoIPService f26082b;
    public final yr f26083c;

    public b0(VoIPService voIPService, yr yrVar, int i7) {
        this.f26081a = i7;
        this.f26082b = voIPService;
        this.f26083c = yrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26081a) {
            case 0:
                this.f26082b.lambda$acceptIncomingCall$103(this.f26083c, tLObject, tL_error);
                return;
            default:
                this.f26082b.lambda$startOutgoingCall$11(this.f26083c, tLObject, tL_error);
                return;
        }
    }
}
