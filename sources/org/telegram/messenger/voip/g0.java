package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19857a;
    public final VoIPService f19858b;
    public final TLRPC.TL_error f19859c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19857a = i10;
        this.f19858b = voIPService;
        this.f19859c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19857a) {
            case 0:
                this.f19858b.lambda$startGroupCall$28(this.f19859c);
                return;
            case 1:
                this.f19858b.lambda$startGroupCall$22(this.f19859c);
                return;
            default:
                this.f19858b.lambda$startScreenCapture$59(this.f19859c);
                return;
        }
    }
}
