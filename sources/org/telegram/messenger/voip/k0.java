package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class k0 implements Runnable {
    public final int f18671a;
    public final VoIPService f18672b;
    public final TLRPC.TL_error f18673c;

    public k0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18671a = i10;
        this.f18672b = voIPService;
        this.f18673c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18671a) {
            case 0:
                this.f18672b.lambda$startGroupCall$28(this.f18673c);
                return;
            case 1:
                this.f18672b.lambda$startGroupCall$22(this.f18673c);
                return;
            default:
                this.f18672b.lambda$startScreenCapture$59(this.f18673c);
                return;
        }
    }
}
