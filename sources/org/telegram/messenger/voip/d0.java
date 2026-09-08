package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f19363a;
    public final VoIPService f19364b;
    public final TLRPC.TL_error f19365c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19363a = i10;
        this.f19364b = voIPService;
        this.f19365c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                this.f19364b.lambda$startGroupCheckShortpoll$61(this.d, this.f19365c);
                return;
            case 1:
                this.f19364b.lambda$processAcceptedCall$19(this.f19365c, this.d);
                return;
            default:
                this.f19364b.lambda$acceptIncomingCall$101(this.f19365c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19363a = 0;
        this.f19364b = voIPService;
        this.d = tLObject;
        this.f19365c = tL_error;
    }
}
