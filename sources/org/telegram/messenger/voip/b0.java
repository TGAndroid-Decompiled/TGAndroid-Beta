package org.telegram.messenger.voip;

import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements RequestDelegate {
    public final int f26099a;
    public final VoIPService f26100b;
    public final yr f26101c;

    public b0(VoIPService voIPService, yr yrVar, int i7) {
        this.f26099a = i7;
        this.f26100b = voIPService;
        this.f26101c = yrVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26099a) {
            case 0:
                this.f26100b.lambda$acceptIncomingCall$103(this.f26101c, tLObject, tL_error);
                return;
            default:
                this.f26100b.lambda$startOutgoingCall$11(this.f26101c, tLObject, tL_error);
                return;
        }
    }
}
