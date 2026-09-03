package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f18747a;
    public final VoIPService f18748b;
    public final TLRPC.TL_error f18749c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18747a = i10;
        this.f18748b = voIPService;
        this.f18749c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18747a) {
            case 0:
                this.f18748b.lambda$startGroupCheckShortpoll$61(this.d, this.f18749c);
                return;
            case 1:
                this.f18748b.lambda$processAcceptedCall$19(this.f18749c, this.d);
                return;
            default:
                this.f18748b.lambda$acceptIncomingCall$101(this.f18749c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18747a = 0;
        this.f18748b = voIPService;
        this.d = tLObject;
        this.f18749c = tL_error;
    }
}
