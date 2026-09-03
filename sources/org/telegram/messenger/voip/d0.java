package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f20394a;
    public final VoIPService f20395b;
    public final TLRPC.TL_error f20396c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20394a = i10;
        this.f20395b = voIPService;
        this.f20396c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f20394a) {
            case 0:
                this.f20395b.lambda$startGroupCheckShortpoll$61(this.d, this.f20396c);
                return;
            case 1:
                this.f20395b.lambda$processAcceptedCall$19(this.f20396c, this.d);
                return;
            default:
                this.f20395b.lambda$acceptIncomingCall$101(this.f20396c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20394a = 0;
        this.f20395b = voIPService;
        this.d = tLObject;
        this.f20396c = tL_error;
    }
}
