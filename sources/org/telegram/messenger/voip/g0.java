package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f16725a;
    public final VoIPService f16726b;
    public final TLRPC.TL_error f16727c;
    public final TLObject d;

    public g0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16725a = i10;
        this.f16726b = voIPService;
        this.f16727c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16725a) {
            case 0:
                this.f16726b.lambda$startGroupCheckShortpoll$61(this.d, this.f16727c);
                return;
            case 1:
                this.f16726b.lambda$processAcceptedCall$19(this.f16727c, this.d);
                return;
            default:
                this.f16726b.lambda$acceptIncomingCall$101(this.f16727c, this.d);
                return;
        }
    }

    public g0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16725a = 0;
        this.f16726b = voIPService;
        this.d = tLObject;
        this.f16727c = tL_error;
    }
}
