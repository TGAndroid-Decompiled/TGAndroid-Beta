package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b0 implements Runnable {
    public final int f27566a;
    public final VoIPService f27567b;
    public final TLRPC.TL_error f27568c;
    public final TLObject d;

    public b0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f27566a = i7;
        this.f27567b = voIPService;
        this.f27568c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27566a) {
            case 0:
                this.f27567b.lambda$startGroupCheckShortpoll$61(this.d, this.f27568c);
                return;
            case 1:
                this.f27567b.lambda$processAcceptedCall$19(this.f27568c, this.d);
                return;
            default:
                this.f27567b.lambda$acceptIncomingCall$101(this.f27568c, this.d);
                return;
        }
    }

    public b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f27566a = 0;
        this.f27567b = voIPService;
        this.d = tLObject;
        this.f27568c = tL_error;
    }
}
