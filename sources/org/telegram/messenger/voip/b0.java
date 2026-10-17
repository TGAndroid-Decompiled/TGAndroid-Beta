package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f19828a;
    public final VoIPService f19829b;
    public final TLRPC.TL_error f19830c;
    public final TLObject d;

    public b0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19828a = i10;
        this.f19829b = voIPService;
        this.f19830c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19828a) {
            case 0:
                this.f19829b.lambda$startGroupCheckShortpoll$61(this.d, this.f19830c);
                return;
            case 1:
                this.f19829b.lambda$processAcceptedCall$19(this.f19830c, this.d);
                return;
            default:
                this.f19829b.lambda$acceptIncomingCall$101(this.f19830c, this.d);
                return;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19828a = 0;
        this.f19829b = voIPService;
        this.d = tLObject;
        this.f19830c = tL_error;
    }
}
