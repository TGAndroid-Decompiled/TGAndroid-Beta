package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17897a;
    public final VoIPService f17898b;
    public final TLRPC.TL_error f17899c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17897a = i10;
        this.f17898b = voIPService;
        this.f17899c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17897a) {
            case 0:
                this.f17898b.lambda$startGroupCall$28(this.f17899c);
                return;
            case 1:
                this.f17898b.lambda$startGroupCall$22(this.f17899c);
                return;
            default:
                this.f17898b.lambda$startScreenCapture$59(this.f17899c);
                return;
        }
    }
}
