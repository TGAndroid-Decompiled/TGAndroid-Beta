package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19374a;
    public final VoIPService f19375b;
    public final TLRPC.TL_error f19376c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19374a = i10;
        this.f19375b = voIPService;
        this.f19376c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19374a) {
            case 0:
                this.f19375b.lambda$startGroupCall$28(this.f19376c);
                return;
            case 1:
                this.f19375b.lambda$startGroupCall$22(this.f19376c);
                return;
            default:
                this.f19375b.lambda$startScreenCapture$59(this.f19376c);
                return;
        }
    }
}
