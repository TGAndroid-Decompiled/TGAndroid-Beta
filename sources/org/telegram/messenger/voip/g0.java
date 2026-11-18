package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27497a;
    public final VoIPService f27498b;
    public final TLRPC.TL_error f27499c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27497a = i7;
        this.f27498b = voIPService;
        this.f27499c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27497a) {
            case 0:
                this.f27498b.lambda$startGroupCall$28(this.f27499c);
                return;
            case 1:
                this.f27498b.lambda$startGroupCall$22(this.f27499c);
                return;
            default:
                this.f27498b.lambda$startScreenCapture$59(this.f27499c);
                return;
        }
    }
}
