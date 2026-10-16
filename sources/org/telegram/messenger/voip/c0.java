package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f18473a;
    public final VoIPService f18474b;
    public final TLRPC.TL_error f18475c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18473a = i10;
        this.f18474b = voIPService;
        this.f18475c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18473a) {
            case 0:
                this.f18474b.lambda$startGroupCheckShortpoll$61(this.d, this.f18475c);
                return;
            case 1:
                this.f18474b.lambda$processAcceptedCall$19(this.f18475c, this.d);
                return;
            default:
                this.f18474b.lambda$acceptIncomingCall$101(this.f18475c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18473a = 0;
        this.f18474b = voIPService;
        this.d = tLObject;
        this.f18475c = tL_error;
    }
}
