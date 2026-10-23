package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f19848a;
    public final VoIPService f19849b;
    public final TLRPC.TL_error f19850c;
    public final TLObject d;

    public a0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19848a = i10;
        this.f19849b = voIPService;
        this.f19850c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                this.f19849b.lambda$startGroupCheckShortpoll$61(this.d, this.f19850c);
                return;
            case 1:
                this.f19849b.lambda$processAcceptedCall$19(this.f19850c, this.d);
                return;
            default:
                this.f19849b.lambda$acceptIncomingCall$101(this.f19850c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19848a = 0;
        this.f19849b = voIPService;
        this.d = tLObject;
        this.f19850c = tL_error;
    }
}
