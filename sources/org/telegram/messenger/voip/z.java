package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f21713a;
    public final VoIPService f21714b;
    public final TLRPC.TL_error f21715c;
    public final TLObject d;

    public z(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21713a = i10;
        this.f21714b = voIPService;
        this.f21715c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21713a) {
            case 0:
                this.f21714b.lambda$startGroupCheckShortpoll$61(this.d, this.f21715c);
                return;
            case 1:
                this.f21714b.lambda$processAcceptedCall$19(this.f21715c, this.d);
                return;
            default:
                this.f21714b.lambda$acceptIncomingCall$101(this.f21715c, this.d);
                return;
        }
    }

    public z(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21713a = 0;
        this.f21714b = voIPService;
        this.d = tLObject;
        this.f21715c = tL_error;
    }
}
