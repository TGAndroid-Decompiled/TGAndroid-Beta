package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f18765a;
    public final VoIPService f18766b;
    public final TLRPC.TL_error f18767c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18765a = i10;
        this.f18766b = voIPService;
        this.f18767c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18765a) {
            case 0:
                this.f18766b.lambda$startGroupCall$28(this.f18767c);
                return;
            case 1:
                this.f18766b.lambda$startGroupCall$22(this.f18767c);
                return;
            default:
                this.f18766b.lambda$startScreenCapture$59(this.f18767c);
                return;
        }
    }
}
