package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f19377a;
    public final VoIPService f19378b;
    public final TLRPC.TL_error f19379c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19377a = i10;
        this.f19378b = voIPService;
        this.f19379c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19377a) {
            case 0:
                this.f19378b.lambda$startGroupCheckShortpoll$61(this.d, this.f19379c);
                return;
            case 1:
                this.f19378b.lambda$processAcceptedCall$19(this.f19379c, this.d);
                return;
            default:
                this.f19378b.lambda$acceptIncomingCall$101(this.f19379c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19377a = 0;
        this.f19378b = voIPService;
        this.d = tLObject;
        this.f19379c = tL_error;
    }
}
