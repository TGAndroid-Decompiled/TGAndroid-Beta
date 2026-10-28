package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f21701a;
    public final VoIPService f21702b;
    public final TLRPC.TL_error f21703c;
    public final TLObject d;

    public z(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21701a = i10;
        this.f21702b = voIPService;
        this.f21703c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21701a) {
            case 0:
                this.f21702b.lambda$startGroupCheckShortpoll$61(this.d, this.f21703c);
                return;
            case 1:
                this.f21702b.lambda$processAcceptedCall$19(this.f21703c, this.d);
                return;
            default:
                this.f21702b.lambda$acceptIncomingCall$101(this.f21703c, this.d);
                return;
        }
    }

    public z(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21701a = 0;
        this.f21702b = voIPService;
        this.d = tLObject;
        this.f21703c = tL_error;
    }
}
