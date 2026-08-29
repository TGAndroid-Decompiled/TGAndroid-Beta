package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f21929a;
    public final VoIPService f21930b;
    public final TLRPC.TL_error f21931c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21929a = i10;
        this.f21930b = voIPService;
        this.f21931c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21929a) {
            case 0:
                this.f21930b.lambda$startGroupCheckShortpoll$61(this.d, this.f21931c);
                return;
            case 1:
                this.f21930b.lambda$processAcceptedCall$19(this.f21931c, this.d);
                return;
            default:
                this.f21930b.lambda$acceptIncomingCall$101(this.f21931c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21929a = 0;
        this.f21930b = voIPService;
        this.d = tLObject;
        this.f21931c = tL_error;
    }
}
