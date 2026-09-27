package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17891a;
    public final VoIPService f17892b;
    public final TLRPC.TL_error f17893c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17891a = i10;
        this.f17892b = voIPService;
        this.f17893c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17891a) {
            case 0:
                this.f17892b.lambda$startGroupCall$28(this.f17893c);
                return;
            case 1:
                this.f17892b.lambda$startGroupCall$22(this.f17893c);
                return;
            default:
                this.f17892b.lambda$startScreenCapture$59(this.f17893c);
                return;
        }
    }
}
