package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17908a;
    public final VoIPService f17909b;
    public final TLRPC.TL_error f17910c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17908a = i10;
        this.f17909b = voIPService;
        this.f17910c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17908a) {
            case 0:
                this.f17909b.lambda$startGroupCall$28(this.f17910c);
                return;
            case 1:
                this.f17909b.lambda$startGroupCall$22(this.f17910c);
                return;
            default:
                this.f17909b.lambda$startScreenCapture$59(this.f17910c);
                return;
        }
    }
}
