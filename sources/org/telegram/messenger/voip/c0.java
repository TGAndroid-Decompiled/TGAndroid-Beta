package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c0 implements Runnable {
    public final int f19566a;
    public final VoIPService f19567b;
    public final TLRPC.TL_error f19568c;
    public final TLObject d;

    public c0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19566a = i10;
        this.f19567b = voIPService;
        this.f19568c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19566a) {
            case 0:
                this.f19567b.lambda$startGroupCheckShortpoll$61(this.d, this.f19568c);
                return;
            case 1:
                this.f19567b.lambda$processAcceptedCall$19(this.f19568c, this.d);
                return;
            default:
                this.f19567b.lambda$acceptIncomingCall$101(this.f19568c, this.d);
                return;
        }
    }

    public c0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19566a = 0;
        this.f19567b = voIPService;
        this.d = tLObject;
        this.f19568c = tL_error;
    }
}
