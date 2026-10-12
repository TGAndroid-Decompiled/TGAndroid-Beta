package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d0 implements Runnable {
    public final int f18782a;
    public final VoIPService f18783b;
    public final TLRPC.TL_error f18784c;
    public final TLObject d;

    public d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18782a = i10;
        this.f18783b = voIPService;
        this.f18784c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18782a) {
            case 0:
                this.f18783b.lambda$startGroupCheckShortpoll$61(this.d, this.f18784c);
                return;
            case 1:
                this.f18783b.lambda$processAcceptedCall$19(this.f18784c, this.d);
                return;
            default:
                this.f18783b.lambda$acceptIncomingCall$101(this.f18784c, this.d);
                return;
        }
    }

    public d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18782a = 0;
        this.f18783b = voIPService;
        this.d = tLObject;
        this.f18784c = tL_error;
    }
}
