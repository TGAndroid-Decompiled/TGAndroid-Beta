package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class b0 implements Runnable {

    public final int f21886a;

    public final VoIPService f21887b;

    public final TLRPC.TL_error f21888c;
    public final TLObject d;

    public b0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21886a = i10;
        this.f21887b = voIPService;
        this.f21888c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21886a) {
            case 0:
                this.f21887b.lambda$startGroupCheckShortpoll$61(this.d, this.f21888c);
                break;
            case 1:
                this.f21887b.lambda$processAcceptedCall$19(this.f21888c, this.d);
                break;
            default:
                this.f21887b.lambda$acceptIncomingCall$101(this.f21888c, this.d);
                break;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21886a = 0;
        this.f21887b = voIPService;
        this.d = tLObject;
        this.f21888c = tL_error;
    }
}
