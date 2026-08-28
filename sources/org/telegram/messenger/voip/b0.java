package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f21862a;
    public final VoIPService f21863b;
    public final TLRPC.TL_error f21864c;
    public final TLObject d;

    public b0(int i9, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21862a = i9;
        this.f21863b = voIPService;
        this.f21864c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21862a) {
            case 0:
                this.f21863b.lambda$startGroupCheckShortpoll$61(this.d, this.f21864c);
                return;
            case 1:
                this.f21863b.lambda$processAcceptedCall$19(this.f21864c, this.d);
                return;
            default:
                this.f21863b.lambda$acceptIncomingCall$101(this.f21864c, this.d);
                return;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21862a = 0;
        this.f21863b = voIPService;
        this.d = tLObject;
        this.f21864c = tL_error;
    }
}
