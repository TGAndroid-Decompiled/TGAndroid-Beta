package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19936a;
    public final VoIPService f19937b;
    public final TLRPC.TL_error f19938c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19936a = i10;
        this.f19937b = voIPService;
        this.f19938c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19936a) {
            case 0:
                this.f19937b.lambda$startGroupCall$28(this.f19938c);
                return;
            case 1:
                this.f19937b.lambda$startGroupCall$22(this.f19938c);
                return;
            default:
                this.f19937b.lambda$startScreenCapture$59(this.f19938c);
                return;
        }
    }
}
