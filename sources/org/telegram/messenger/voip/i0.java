package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class i0 implements Runnable {
    public final int f18815a;
    public final VoIPService f18816b;
    public final TLRPC.TL_error f18817c;

    public i0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18815a = i10;
        this.f18816b = voIPService;
        this.f18817c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18815a) {
            case 0:
                this.f18816b.lambda$startGroupCall$28(this.f18817c);
                return;
            case 1:
                this.f18816b.lambda$startGroupCall$22(this.f18817c);
                return;
            default:
                this.f18816b.lambda$startScreenCapture$59(this.f18817c);
                return;
        }
    }
}
