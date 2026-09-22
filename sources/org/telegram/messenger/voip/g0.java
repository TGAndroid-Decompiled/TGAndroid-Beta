package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17649a;
    public final VoIPService f17650b;
    public final TLRPC.TL_error f17651c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17649a = i10;
        this.f17650b = voIPService;
        this.f17651c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17649a) {
            case 0:
                this.f17650b.lambda$startGroupCall$28(this.f17651c);
                return;
            case 1:
                this.f17650b.lambda$startGroupCall$22(this.f17651c);
                return;
            default:
                this.f17650b.lambda$startScreenCapture$59(this.f17651c);
                return;
        }
    }
}
