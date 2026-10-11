package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19530a;
    public final VoIPService f19531b;
    public final TLRPC.TL_error f19532c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19530a = i10;
        this.f19531b = voIPService;
        this.f19532c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                this.f19531b.lambda$startGroupCheckShortpoll$61(this.d, this.f19532c);
                return;
            case 1:
                this.f19531b.lambda$processAcceptedCall$19(this.f19532c, this.d);
                return;
            default:
                this.f19531b.lambda$acceptIncomingCall$101(this.f19532c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19530a = 0;
        this.f19531b = voIPService;
        this.d = tLObject;
        this.f19532c = tL_error;
    }
}
