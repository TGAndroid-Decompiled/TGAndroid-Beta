package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f19830a;
    public final VoIPService f19831b;
    public final TLRPC.TL_error f19832c;
    public final TLObject d;

    public a0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19830a = i10;
        this.f19831b = voIPService;
        this.f19832c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19830a) {
            case 0:
                this.f19831b.lambda$startGroupCheckShortpoll$61(this.d, this.f19832c);
                return;
            case 1:
                this.f19831b.lambda$processAcceptedCall$19(this.f19832c, this.d);
                return;
            default:
                this.f19831b.lambda$acceptIncomingCall$101(this.f19832c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19830a = 0;
        this.f19831b = voIPService;
        this.d = tLObject;
        this.f19832c = tL_error;
    }
}
