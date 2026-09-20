package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f17857a;
    public final VoIPService f17858b;
    public final TLRPC.TL_error f17859c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17857a = i10;
        this.f17858b = voIPService;
        this.f17859c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17857a) {
            case 0:
                this.f17858b.lambda$startGroupCheckShortpoll$61(this.d, this.f17859c);
                return;
            case 1:
                this.f17858b.lambda$processAcceptedCall$19(this.f17859c, this.d);
                return;
            default:
                this.f17858b.lambda$acceptIncomingCall$101(this.f17859c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17857a = 0;
        this.f17858b = voIPService;
        this.d = tLObject;
        this.f17859c = tL_error;
    }
}
