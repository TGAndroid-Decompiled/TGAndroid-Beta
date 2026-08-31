package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f20411a;
    public final VoIPService f20412b;
    public final TLRPC.TL_error f20413c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f20411a = i10;
        this.f20412b = voIPService;
        this.f20413c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20411a) {
            case 0:
                this.f20412b.lambda$startGroupCall$28(this.f20413c);
                return;
            case 1:
                this.f20412b.lambda$startGroupCall$22(this.f20413c);
                return;
            default:
                this.f20412b.lambda$startScreenCapture$59(this.f20413c);
                return;
        }
    }
}
