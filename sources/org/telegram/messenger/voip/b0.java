package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f19839a;
    public final VoIPService f19840b;
    public final TLRPC.TL_error f19841c;
    public final TLObject d;

    public b0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19839a = i10;
        this.f19840b = voIPService;
        this.f19841c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19839a) {
            case 0:
                this.f19840b.lambda$startGroupCheckShortpoll$61(this.d, this.f19841c);
                return;
            case 1:
                this.f19840b.lambda$processAcceptedCall$19(this.f19841c, this.d);
                return;
            default:
                this.f19840b.lambda$acceptIncomingCall$101(this.f19841c, this.d);
                return;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19839a = 0;
        this.f19840b = voIPService;
        this.d = tLObject;
        this.f19841c = tL_error;
    }
}
