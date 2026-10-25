package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f21633a;
    public final VoIPService f21634b;
    public final TLRPC.TL_error f21635c;

    public e0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f21633a = i10;
        this.f21634b = voIPService;
        this.f21635c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21633a) {
            case 0:
                this.f21634b.lambda$startGroupCall$28(this.f21635c);
                return;
            case 1:
                this.f21634b.lambda$startGroupCall$22(this.f21635c);
                return;
            default:
                this.f21634b.lambda$startScreenCapture$59(this.f21635c);
                return;
        }
    }
}
