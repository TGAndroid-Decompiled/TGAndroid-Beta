package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19343a;
    public final VoIPService f19344b;
    public final TLRPC.TL_error f19345c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19343a = i10;
        this.f19344b = voIPService;
        this.f19345c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19343a) {
            case 0:
                this.f19344b.lambda$startGroupCall$28(this.f19345c);
                return;
            case 1:
                this.f19344b.lambda$startGroupCall$22(this.f19345c);
                return;
            default:
                this.f19344b.lambda$startScreenCapture$59(this.f19345c);
                return;
        }
    }
}
