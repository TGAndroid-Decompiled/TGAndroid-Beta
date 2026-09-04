package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f19336a;
    public final VoIPService f19337b;
    public final TLRPC.TL_error f19338c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19336a = i10;
        this.f19337b = voIPService;
        this.f19338c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19336a) {
            case 0:
                this.f19337b.lambda$startGroupCheckShortpoll$61(this.d, this.f19338c);
                return;
            case 1:
                this.f19337b.lambda$processAcceptedCall$19(this.f19338c, this.d);
                return;
            default:
                this.f19337b.lambda$acceptIncomingCall$101(this.f19338c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19336a = 0;
        this.f19337b = voIPService;
        this.d = tLObject;
        this.f19338c = tL_error;
    }
}
