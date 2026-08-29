package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f21948a;
    public final VoIPService f21949b;
    public final TLRPC.TL_error f21950c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f21948a = i10;
        this.f21949b = voIPService;
        this.f21950c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21948a) {
            case 0:
                this.f21949b.lambda$startGroupCall$28(this.f21950c);
                return;
            case 1:
                this.f21949b.lambda$startGroupCall$22(this.f21950c);
                return;
            default:
                this.f21949b.lambda$startScreenCapture$59(this.f21950c);
                return;
        }
    }
}
