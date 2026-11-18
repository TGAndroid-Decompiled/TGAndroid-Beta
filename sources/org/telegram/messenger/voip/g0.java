package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27495a;
    public final VoIPService f27496b;
    public final TLRPC.TL_error f27497c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27495a = i7;
        this.f27496b = voIPService;
        this.f27497c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27495a) {
            case 0:
                this.f27496b.lambda$startGroupCall$28(this.f27497c);
                return;
            case 1:
                this.f27496b.lambda$startGroupCall$22(this.f27497c);
                return;
            default:
                this.f27496b.lambda$startScreenCapture$59(this.f27497c);
                return;
        }
    }
}
