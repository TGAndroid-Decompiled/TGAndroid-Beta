package org.telegram.messenger.voip;

import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27501a;
    public final VoIPService f27502b;
    public final tr f27503c;

    public c0(VoIPService voIPService, tr trVar, int i7) {
        this.f27501a = i7;
        this.f27502b = voIPService;
        this.f27503c = trVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27501a) {
            case 0:
                this.f27502b.lambda$acceptIncomingCall$103(this.f27503c, tLObject, tL_error);
                return;
            default:
                this.f27502b.lambda$startOutgoingCall$11(this.f27503c, tLObject, tL_error);
                return;
        }
    }
}
