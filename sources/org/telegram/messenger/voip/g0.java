package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17654a;
    public final VoIPService f17655b;
    public final TLRPC.TL_error f17656c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17654a = i10;
        this.f17655b = voIPService;
        this.f17656c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17654a) {
            case 0:
                this.f17655b.lambda$startGroupCall$28(this.f17656c);
                return;
            case 1:
                this.f17655b.lambda$startGroupCall$22(this.f17656c);
                return;
            default:
                this.f17655b.lambda$startScreenCapture$59(this.f17656c);
                return;
        }
    }
}
