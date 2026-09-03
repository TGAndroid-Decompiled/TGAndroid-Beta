package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f20413a;
    public final VoIPService f20414b;
    public final TLRPC.TL_error f20415c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f20413a = i10;
        this.f20414b = voIPService;
        this.f20415c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20413a) {
            case 0:
                this.f20414b.lambda$startGroupCall$28(this.f20415c);
                return;
            case 1:
                this.f20414b.lambda$startGroupCall$22(this.f20415c);
                return;
            default:
                this.f20414b.lambda$startScreenCapture$59(this.f20415c);
                return;
        }
    }
}
