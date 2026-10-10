package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class i0 implements Runnable {
    public final int f19577a;
    public final VoIPService f19578b;
    public final TLRPC.TL_error f19579c;

    public i0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19577a = i10;
        this.f19578b = voIPService;
        this.f19579c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19577a) {
            case 0:
                this.f19578b.lambda$startGroupCall$28(this.f19579c);
                return;
            case 1:
                this.f19578b.lambda$startGroupCall$22(this.f19579c);
                return;
            default:
                this.f19578b.lambda$startScreenCapture$59(this.f19579c);
                return;
        }
    }
}
