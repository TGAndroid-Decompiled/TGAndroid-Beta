package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27129a;
    public final VoIPService f27130b;
    public final TLRPC.TL_error f27131c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27129a = i7;
        this.f27130b = voIPService;
        this.f27131c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27129a) {
            case 0:
                this.f27130b.lambda$startGroupCall$28(this.f27131c);
                return;
            case 1:
                this.f27130b.lambda$startGroupCall$22(this.f27131c);
                return;
            default:
                this.f27130b.lambda$startScreenCapture$59(this.f27131c);
                return;
        }
    }
}
