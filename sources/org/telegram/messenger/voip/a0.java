package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f26090a;
    public final VoIPService f26091b;
    public final TLRPC.TL_error f26092c;
    public final TLObject d;

    public a0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26090a = i7;
        this.f26091b = voIPService;
        this.f26092c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26090a) {
            case 0:
                this.f26091b.lambda$startGroupCheckShortpoll$61(this.d, this.f26092c);
                return;
            case 1:
                this.f26091b.lambda$processAcceptedCall$19(this.f26092c, this.d);
                return;
            default:
                this.f26091b.lambda$acceptIncomingCall$101(this.f26092c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26090a = 0;
        this.f26091b = voIPService;
        this.d = tLObject;
        this.f26092c = tL_error;
    }
}
