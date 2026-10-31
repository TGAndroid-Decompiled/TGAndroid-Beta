package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f18633a;
    public final VoIPService f18634b;
    public final TLRPC.TL_error f18635c;
    public final TLObject d;

    public e0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18633a = i10;
        this.f18634b = voIPService;
        this.f18635c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18633a) {
            case 0:
                this.f18634b.lambda$startGroupCheckShortpoll$61(this.d, this.f18635c);
                return;
            case 1:
                this.f18634b.lambda$processAcceptedCall$19(this.f18635c, this.d);
                return;
            default:
                this.f18634b.lambda$acceptIncomingCall$101(this.f18635c, this.d);
                return;
        }
    }

    public e0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18633a = 0;
        this.f18634b = voIPService;
        this.d = tLObject;
        this.f18635c = tL_error;
    }
}
