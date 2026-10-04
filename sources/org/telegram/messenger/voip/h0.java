package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19556a;
    public final VoIPService f19557b;
    public final TLRPC.TL_error f19558c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19556a = i10;
        this.f19557b = voIPService;
        this.f19558c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19556a) {
            case 0:
                this.f19557b.lambda$startGroupCall$28(this.f19558c);
                return;
            case 1:
                this.f19557b.lambda$startGroupCall$22(this.f19558c);
                return;
            default:
                this.f19557b.lambda$startScreenCapture$59(this.f19558c);
                return;
        }
    }
}
