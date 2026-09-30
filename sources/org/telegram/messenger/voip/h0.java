package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f17912a;
    public final VoIPService f17913b;
    public final TLRPC.TL_error f17914c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17912a = i10;
        this.f17913b = voIPService;
        this.f17914c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17912a) {
            case 0:
                this.f17913b.lambda$startGroupCall$28(this.f17914c);
                return;
            case 1:
                this.f17913b.lambda$startGroupCall$22(this.f17914c);
                return;
            default:
                this.f17913b.lambda$startScreenCapture$59(this.f17914c);
                return;
        }
    }
}
