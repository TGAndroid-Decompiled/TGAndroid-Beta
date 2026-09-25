package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f17876a;
    public final VoIPService f17877b;
    public final TLRPC.TL_error f17878c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17876a = i10;
        this.f17877b = voIPService;
        this.f17878c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17876a) {
            case 0:
                this.f17877b.lambda$startGroupCheckShortpoll$61(this.d, this.f17878c);
                return;
            case 1:
                this.f17877b.lambda$processAcceptedCall$19(this.f17878c, this.d);
                return;
            default:
                this.f17877b.lambda$acceptIncomingCall$101(this.f17878c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17876a = 0;
        this.f17877b = voIPService;
        this.d = tLObject;
        this.f17878c = tL_error;
    }
}
