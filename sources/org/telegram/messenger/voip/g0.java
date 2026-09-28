package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17907a;
    public final VoIPService f17908b;
    public final TLRPC.TL_error f17909c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17907a = i10;
        this.f17908b = voIPService;
        this.f17909c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17907a) {
            case 0:
                this.f17908b.lambda$startGroupCall$28(this.f17909c);
                return;
            case 1:
                this.f17908b.lambda$startGroupCall$22(this.f17909c);
                return;
            default:
                this.f17908b.lambda$startScreenCapture$59(this.f17909c);
                return;
        }
    }
}
