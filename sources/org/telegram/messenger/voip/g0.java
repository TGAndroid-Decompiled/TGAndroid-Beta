package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17893a;
    public final VoIPService f17894b;
    public final TLRPC.TL_error f17895c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17893a = i10;
        this.f17894b = voIPService;
        this.f17895c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                this.f17894b.lambda$startGroupCall$28(this.f17895c);
                return;
            case 1:
                this.f17894b.lambda$startGroupCall$22(this.f17895c);
                return;
            default:
                this.f17894b.lambda$startScreenCapture$59(this.f17895c);
                return;
        }
    }
}
