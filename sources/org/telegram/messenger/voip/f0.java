package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19876a;
    public final VoIPService f19877b;
    public final TLRPC.TL_error f19878c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19876a = i10;
        this.f19877b = voIPService;
        this.f19878c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19876a) {
            case 0:
                this.f19877b.lambda$startGroupCall$28(this.f19878c);
                return;
            case 1:
                this.f19877b.lambda$startGroupCall$22(this.f19878c);
                return;
            default:
                this.f19877b.lambda$startScreenCapture$59(this.f19878c);
                return;
        }
    }
}
