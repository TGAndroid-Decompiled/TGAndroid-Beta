package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17882a;
    public final VoIPService f17883b;
    public final TLRPC.TL_error f17884c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17882a = i10;
        this.f17883b = voIPService;
        this.f17884c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17882a) {
            case 0:
                this.f17883b.lambda$startGroupCall$28(this.f17884c);
                return;
            case 1:
                this.f17883b.lambda$startGroupCall$22(this.f17884c);
                return;
            default:
                this.f17883b.lambda$startScreenCapture$59(this.f17884c);
                return;
        }
    }
}
