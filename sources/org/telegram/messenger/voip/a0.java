package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f26084a;
    public final VoIPService f26085b;
    public final TLRPC.TL_error f26086c;
    public final TLObject d;

    public a0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26084a = i7;
        this.f26085b = voIPService;
        this.f26086c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26084a) {
            case 0:
                this.f26085b.lambda$startGroupCheckShortpoll$61(this.d, this.f26086c);
                return;
            case 1:
                this.f26085b.lambda$processAcceptedCall$19(this.f26086c, this.d);
                return;
            default:
                this.f26085b.lambda$acceptIncomingCall$101(this.f26086c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26084a = 0;
        this.f26085b = voIPService;
        this.d = tLObject;
        this.f26086c = tL_error;
    }
}
