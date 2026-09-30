package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f17879a;
    public final VoIPService f17880b;
    public final TLRPC.TL_error f17881c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17879a = i10;
        this.f17880b = voIPService;
        this.f17881c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17879a) {
            case 0:
                this.f17880b.lambda$startGroupCheckShortpoll$61(this.d, this.f17881c);
                return;
            case 1:
                this.f17880b.lambda$processAcceptedCall$19(this.f17881c, this.d);
                return;
            default:
                this.f17880b.lambda$acceptIncomingCall$101(this.f17881c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17879a = 0;
        this.f17880b = voIPService;
        this.d = tLObject;
        this.f17881c = tL_error;
    }
}
