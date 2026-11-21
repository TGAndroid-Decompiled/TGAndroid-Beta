package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27523a;
    public final VoIPService f27524b;
    public final TLRPC.TL_error f27525c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27523a = i7;
        this.f27524b = voIPService;
        this.f27525c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27523a) {
            case 0:
                this.f27524b.lambda$startGroupCall$28(this.f27525c);
                return;
            case 1:
                this.f27524b.lambda$startGroupCall$22(this.f27525c);
                return;
            default:
                this.f27524b.lambda$startScreenCapture$59(this.f27525c);
                return;
        }
    }
}
