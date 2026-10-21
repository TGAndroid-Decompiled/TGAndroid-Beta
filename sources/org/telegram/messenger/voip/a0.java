package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f19824a;
    public final VoIPService f19825b;
    public final TLRPC.TL_error f19826c;
    public final TLObject d;

    public a0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19824a = i10;
        this.f19825b = voIPService;
        this.f19826c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19824a) {
            case 0:
                this.f19825b.lambda$startGroupCheckShortpoll$61(this.d, this.f19826c);
                return;
            case 1:
                this.f19825b.lambda$processAcceptedCall$19(this.f19826c, this.d);
                return;
            default:
                this.f19825b.lambda$acceptIncomingCall$101(this.f19826c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19824a = 0;
        this.f19825b = voIPService;
        this.d = tLObject;
        this.f19826c = tL_error;
    }
}
