package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f25996a;
    public final VoIPService f25997b;
    public final TLRPC.TL_error f25998c;

    public e0(VoIPService voIPService, TLRPC.TL_error tL_error, int i3) {
        this.f25996a = i3;
        this.f25997b = voIPService;
        this.f25998c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25996a) {
            case 0:
                this.f25997b.lambda$startGroupCall$28(this.f25998c);
                return;
            case 1:
                this.f25997b.lambda$startGroupCall$22(this.f25998c);
                return;
            default:
                this.f25997b.lambda$startScreenCapture$59(this.f25998c);
                return;
        }
    }
}
