package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17878a;
    public final VoIPService f17879b;
    public final TLRPC.TL_error f17880c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17878a = i10;
        this.f17879b = voIPService;
        this.f17880c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                this.f17879b.lambda$startGroupCall$28(this.f17880c);
                return;
            case 1:
                this.f17879b.lambda$startGroupCall$22(this.f17880c);
                return;
            default:
                this.f17879b.lambda$startScreenCapture$59(this.f17880c);
                return;
        }
    }
}
