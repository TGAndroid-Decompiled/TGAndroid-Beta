package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19564a;
    public final VoIPService f19565b;
    public final TLRPC.TL_error f19566c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19564a = i10;
        this.f19565b = voIPService;
        this.f19566c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19564a) {
            case 0:
                this.f19565b.lambda$startGroupCall$28(this.f19566c);
                return;
            case 1:
                this.f19565b.lambda$startGroupCall$22(this.f19566c);
                return;
            default:
                this.f19565b.lambda$startScreenCapture$59(this.f19566c);
                return;
        }
    }
}
