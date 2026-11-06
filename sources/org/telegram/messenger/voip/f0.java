package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f26103a;
    public final VoIPService f26104b;
    public final TLRPC.TL_error f26105c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f26103a = i7;
        this.f26104b = voIPService;
        this.f26105c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26103a) {
            case 0:
                this.f26104b.lambda$startGroupCall$28(this.f26105c);
                return;
            case 1:
                this.f26104b.lambda$startGroupCall$22(this.f26105c);
                return;
            default:
                this.f26104b.lambda$startScreenCapture$59(this.f26105c);
                return;
        }
    }
}
