package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f17872a;
    public final VoIPService f17873b;
    public final TLRPC.TL_error f17874c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17872a = i10;
        this.f17873b = voIPService;
        this.f17874c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17872a) {
            case 0:
                this.f17873b.lambda$startGroupCheckShortpoll$61(this.d, this.f17874c);
                return;
            case 1:
                this.f17873b.lambda$processAcceptedCall$19(this.f17874c, this.d);
                return;
            default:
                this.f17873b.lambda$acceptIncomingCall$101(this.f17874c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17872a = 0;
        this.f17873b = voIPService;
        this.d = tLObject;
        this.f17874c = tL_error;
    }
}
