package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f19827a;
    public final VoIPService f19828b;
    public final TLRPC.TL_error f19829c;
    public final TLObject d;

    public a0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19827a = i10;
        this.f19828b = voIPService;
        this.f19829c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                this.f19828b.lambda$startGroupCheckShortpoll$61(this.d, this.f19829c);
                return;
            case 1:
                this.f19828b.lambda$processAcceptedCall$19(this.f19829c, this.d);
                return;
            default:
                this.f19828b.lambda$acceptIncomingCall$101(this.f19829c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19827a = 0;
        this.f19828b = voIPService;
        this.d = tLObject;
        this.f19829c = tL_error;
    }
}
