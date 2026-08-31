package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f20392a;
    public final VoIPService f20393b;
    public final TLRPC.TL_error f20394c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20392a = i10;
        this.f20393b = voIPService;
        this.f20394c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20392a) {
            case 0:
                this.f20393b.lambda$startGroupCheckShortpoll$61(this.d, this.f20394c);
                return;
            case 1:
                this.f20393b.lambda$processAcceptedCall$19(this.f20394c, this.d);
                return;
            default:
                this.f20393b.lambda$acceptIncomingCall$101(this.f20394c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20392a = 0;
        this.f20393b = voIPService;
        this.d = tLObject;
        this.f20394c = tL_error;
    }
}
