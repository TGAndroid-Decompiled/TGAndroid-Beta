package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f26076a;
    public final VoIPService f26077b;
    public final TLRPC.TL_error f26078c;
    public final TLObject d;

    public a0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26076a = i7;
        this.f26077b = voIPService;
        this.f26078c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26076a) {
            case 0:
                this.f26077b.lambda$startGroupCheckShortpoll$61(this.d, this.f26078c);
                return;
            case 1:
                this.f26077b.lambda$processAcceptedCall$19(this.f26078c, this.d);
                return;
            default:
                this.f26077b.lambda$acceptIncomingCall$101(this.f26078c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26076a = 0;
        this.f26077b = voIPService;
        this.d = tLObject;
        this.f26078c = tL_error;
    }
}
