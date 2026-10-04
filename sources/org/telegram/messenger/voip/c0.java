package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19520a;
    public final VoIPService f19521b;
    public final TLRPC.TL_error f19522c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19520a = i10;
        this.f19521b = voIPService;
        this.f19522c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19520a) {
            case 0:
                this.f19521b.lambda$startGroupCheckShortpoll$61(this.d, this.f19522c);
                return;
            case 1:
                this.f19521b.lambda$processAcceptedCall$19(this.f19522c, this.d);
                return;
            default:
                this.f19521b.lambda$acceptIncomingCall$101(this.f19522c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19520a = 0;
        this.f19521b = voIPService;
        this.d = tLObject;
        this.f19522c = tL_error;
    }
}
