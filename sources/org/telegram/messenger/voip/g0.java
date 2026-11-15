package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27128a;
    public final VoIPService f27129b;
    public final TLRPC.TL_error f27130c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27128a = i7;
        this.f27129b = voIPService;
        this.f27130c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27128a) {
            case 0:
                this.f27129b.lambda$startGroupCall$28(this.f27130c);
                return;
            case 1:
                this.f27129b.lambda$startGroupCall$22(this.f27130c);
                return;
            default:
                this.f27129b.lambda$startScreenCapture$59(this.f27130c);
                return;
        }
    }
}
