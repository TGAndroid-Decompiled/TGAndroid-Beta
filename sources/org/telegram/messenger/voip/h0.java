package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f18506a;
    public final VoIPService f18507b;
    public final TLRPC.TL_error f18508c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18506a = i10;
        this.f18507b = voIPService;
        this.f18508c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18506a) {
            case 0:
                this.f18507b.lambda$startGroupCall$28(this.f18508c);
                return;
            case 1:
                this.f18507b.lambda$startGroupCall$22(this.f18508c);
                return;
            default:
                this.f18507b.lambda$startScreenCapture$59(this.f18508c);
                return;
        }
    }
}
