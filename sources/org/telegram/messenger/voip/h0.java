package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19342a;
    public final VoIPService f19343b;
    public final TLRPC.TL_error f19344c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19342a = i10;
        this.f19343b = voIPService;
        this.f19344c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19342a) {
            case 0:
                this.f19343b.lambda$startGroupCall$28(this.f19344c);
                return;
            case 1:
                this.f19343b.lambda$startGroupCall$22(this.f19344c);
                return;
            default:
                this.f19343b.lambda$startScreenCapture$59(this.f19344c);
                return;
        }
    }
}
