package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z implements Runnable {
    public final int f26080a;
    public final VoIPService f26081b;
    public final TLRPC.TL_error f26082c;
    public final TLObject d;

    public z(int i3, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26080a = i3;
        this.f26081b = voIPService;
        this.f26082c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26080a) {
            case 0:
                this.f26081b.lambda$startGroupCheckShortpoll$61(this.d, this.f26082c);
                return;
            case 1:
                this.f26081b.lambda$processAcceptedCall$19(this.f26082c, this.d);
                return;
            default:
                this.f26081b.lambda$acceptIncomingCall$101(this.f26082c, this.d);
                return;
        }
    }

    public z(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26080a = 0;
        this.f26081b = voIPService;
        this.d = tLObject;
        this.f26082c = tL_error;
    }
}
