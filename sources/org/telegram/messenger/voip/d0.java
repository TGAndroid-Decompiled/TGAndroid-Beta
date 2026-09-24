package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f17861a;
    public final VoIPService f17862b;
    public final TLRPC.TL_error f17863c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17861a = i10;
        this.f17862b = voIPService;
        this.f17863c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17861a) {
            case 0:
                this.f17862b.lambda$startGroupCheckShortpoll$61(this.d, this.f17863c);
                return;
            case 1:
                this.f17862b.lambda$processAcceptedCall$19(this.f17863c, this.d);
                return;
            default:
                this.f17862b.lambda$acceptIncomingCall$101(this.f17863c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17861a = 0;
        this.f17862b = voIPService;
        this.d = tLObject;
        this.f17863c = tL_error;
    }
}
