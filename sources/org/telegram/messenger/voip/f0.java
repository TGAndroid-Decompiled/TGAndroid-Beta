package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19858a;
    public final VoIPService f19859b;
    public final TLRPC.TL_error f19860c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19858a = i10;
        this.f19859b = voIPService;
        this.f19860c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19858a) {
            case 0:
                this.f19859b.lambda$startGroupCall$28(this.f19860c);
                return;
            case 1:
                this.f19859b.lambda$startGroupCall$22(this.f19860c);
                return;
            default:
                this.f19859b.lambda$startScreenCapture$59(this.f19860c);
                return;
        }
    }
}
