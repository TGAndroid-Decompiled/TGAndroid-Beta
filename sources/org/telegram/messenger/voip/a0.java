package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a0 implements Runnable {
    public final int f26094a;
    public final VoIPService f26095b;
    public final TLRPC.TL_error f26096c;
    public final TLObject d;

    public a0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26094a = i7;
        this.f26095b = voIPService;
        this.f26096c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26094a) {
            case 0:
                this.f26095b.lambda$startGroupCheckShortpoll$61(this.d, this.f26096c);
                return;
            case 1:
                this.f26095b.lambda$processAcceptedCall$19(this.f26096c, this.d);
                return;
            default:
                this.f26095b.lambda$acceptIncomingCall$101(this.f26096c, this.d);
                return;
        }
    }

    public a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f26094a = 0;
        this.f26095b = voIPService;
        this.d = tLObject;
        this.f26096c = tL_error;
    }
}
