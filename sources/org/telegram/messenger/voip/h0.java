package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19602a;
    public final VoIPService f19603b;
    public final TLRPC.TL_error f19604c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19602a = i10;
        this.f19603b = voIPService;
        this.f19604c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19602a) {
            case 0:
                this.f19603b.lambda$startGroupCall$28(this.f19604c);
                return;
            case 1:
                this.f19603b.lambda$startGroupCall$22(this.f19604c);
                return;
            default:
                this.f19603b.lambda$startScreenCapture$59(this.f19604c);
                return;
        }
    }
}
