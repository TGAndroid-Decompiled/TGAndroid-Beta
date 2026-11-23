package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27486a;
    public final VoIPService f27487b;
    public final TLRPC.TL_error f27488c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27486a = i7;
        this.f27487b = voIPService;
        this.f27488c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27486a) {
            case 0:
                this.f27487b.lambda$startGroupCall$28(this.f27488c);
                return;
            case 1:
                this.f27487b.lambda$startGroupCall$22(this.f27488c);
                return;
            default:
                this.f27487b.lambda$startScreenCapture$59(this.f27488c);
                return;
        }
    }
}
