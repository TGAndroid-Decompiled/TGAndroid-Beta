package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19387a;
    public final VoIPService f19388b;
    public final TLRPC.TL_error f19389c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19387a = i10;
        this.f19388b = voIPService;
        this.f19389c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19387a) {
            case 0:
                this.f19388b.lambda$startGroupCall$28(this.f19389c);
                return;
            case 1:
                this.f19388b.lambda$startGroupCall$22(this.f19389c);
                return;
            default:
                this.f19388b.lambda$startScreenCapture$59(this.f19389c);
                return;
        }
    }
}
