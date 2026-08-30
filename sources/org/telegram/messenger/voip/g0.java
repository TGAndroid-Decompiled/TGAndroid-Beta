package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f18783a;
    public final VoIPService f18784b;
    public final TLRPC.TL_error f18785c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18783a = i10;
        this.f18784b = voIPService;
        this.f18785c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18783a) {
            case 0:
                this.f18784b.lambda$startGroupCall$28(this.f18785c);
                return;
            case 1:
                this.f18784b.lambda$startGroupCall$22(this.f18785c);
                return;
            default:
                this.f18784b.lambda$startScreenCapture$59(this.f18785c);
                return;
        }
    }
}
