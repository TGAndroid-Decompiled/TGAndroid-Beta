package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class e0 implements Runnable {
    public final int f21878a;
    public final VoIPService f21879b;
    public final TLRPC.TL_error f21880c;

    public e0(VoIPService voIPService, TLRPC.TL_error tL_error, int i9) {
        this.f21878a = i9;
        this.f21879b = voIPService;
        this.f21880c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21878a) {
            case 0:
                this.f21879b.lambda$startGroupCall$28(this.f21880c);
                return;
            case 1:
                this.f21879b.lambda$startGroupCall$22(this.f21880c);
                return;
            default:
                this.f21879b.lambda$startScreenCapture$59(this.f21880c);
                return;
        }
    }
}
