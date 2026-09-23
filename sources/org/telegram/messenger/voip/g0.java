package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17638a;
    public final VoIPService f17639b;
    public final TLRPC.TL_error f17640c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17638a = i10;
        this.f17639b = voIPService;
        this.f17640c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17638a) {
            case 0:
                this.f17639b.lambda$startGroupCall$28(this.f17640c);
                return;
            case 1:
                this.f17639b.lambda$startGroupCall$22(this.f17640c);
                return;
            default:
                this.f17639b.lambda$startScreenCapture$59(this.f17640c);
                return;
        }
    }
}
