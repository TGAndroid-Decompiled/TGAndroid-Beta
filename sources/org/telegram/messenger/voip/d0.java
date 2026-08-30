package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f18765a;
    public final VoIPService f18766b;
    public final TLRPC.TL_error f18767c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18765a = i10;
        this.f18766b = voIPService;
        this.f18767c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18765a) {
            case 0:
                this.f18766b.lambda$startGroupCheckShortpoll$61(this.d, this.f18767c);
                return;
            case 1:
                this.f18766b.lambda$processAcceptedCall$19(this.f18767c, this.d);
                return;
            default:
                this.f18766b.lambda$acceptIncomingCall$101(this.f18767c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18765a = 0;
        this.f18766b = voIPService;
        this.d = tLObject;
        this.f18767c = tL_error;
    }
}
