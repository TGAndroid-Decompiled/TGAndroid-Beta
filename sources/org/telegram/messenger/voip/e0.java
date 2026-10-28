package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f21621a;
    public final VoIPService f21622b;
    public final TLRPC.TL_error f21623c;

    public e0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f21621a = i10;
        this.f21622b = voIPService;
        this.f21623c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21621a) {
            case 0:
                this.f21622b.lambda$startGroupCall$28(this.f21623c);
                return;
            case 1:
                this.f21622b.lambda$startGroupCall$22(this.f21623c);
                return;
            default:
                this.f21622b.lambda$startScreenCapture$59(this.f21623c);
                return;
        }
    }
}
