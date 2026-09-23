package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f17617a;
    public final VoIPService f17618b;
    public final TLRPC.TL_error f17619c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17617a = i10;
        this.f17618b = voIPService;
        this.f17619c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                this.f17618b.lambda$startGroupCheckShortpoll$61(this.d, this.f17619c);
                return;
            case 1:
                this.f17618b.lambda$processAcceptedCall$19(this.f17619c, this.d);
                return;
            default:
                this.f17618b.lambda$acceptIncomingCall$101(this.f17619c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17617a = 0;
        this.f17618b = voIPService;
        this.d = tLObject;
        this.f17619c = tL_error;
    }
}
