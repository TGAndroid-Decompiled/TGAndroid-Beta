package org.telegram.messenger.voip;

import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements RequestDelegate {
    public final int f27475a;
    public final VoIPService f27476b;
    public final tr f27477c;

    public c0(VoIPService voIPService, tr trVar, int i7) {
        this.f27475a = i7;
        this.f27476b = voIPService;
        this.f27477c = trVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27475a) {
            case 0:
                this.f27476b.lambda$acceptIncomingCall$103(this.f27477c, tLObject, tL_error);
                return;
            default:
                this.f27476b.lambda$startOutgoingCall$11(this.f27477c, tLObject, tL_error);
                return;
        }
    }
}
