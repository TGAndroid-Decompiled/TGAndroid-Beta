package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17924a;
    public final VoIPService f17925b;
    public final TLRPC.TL_error f17926c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17924a = i10;
        this.f17925b = voIPService;
        this.f17926c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17924a) {
            case 0:
                this.f17925b.lambda$startGroupCall$28(this.f17926c);
                return;
            case 1:
                this.f17925b.lambda$startGroupCall$22(this.f17926c);
                return;
            default:
                this.f17925b.lambda$startScreenCapture$59(this.f17926c);
                return;
        }
    }
}
