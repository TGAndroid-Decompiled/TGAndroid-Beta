package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f27103a;
    public final VoIPService f27104b;
    public final TLRPC.TL_error f27105c;
    public final TLObject d;

    public b0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f27103a = i7;
        this.f27104b = voIPService;
        this.f27105c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27103a) {
            case 0:
                this.f27104b.lambda$startGroupCheckShortpoll$61(this.d, this.f27105c);
                return;
            case 1:
                this.f27104b.lambda$processAcceptedCall$19(this.f27105c, this.d);
                return;
            default:
                this.f27104b.lambda$acceptIncomingCall$101(this.f27105c, this.d);
                return;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f27103a = 0;
        this.f27104b = voIPService;
        this.d = tLObject;
        this.f27105c = tL_error;
    }
}
