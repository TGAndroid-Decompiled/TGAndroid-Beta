package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f27591a;
    public final VoIPService f27592b;
    public final TLRPC.TL_error f27593c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f27591a = i7;
        this.f27592b = voIPService;
        this.f27593c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27591a) {
            case 0:
                this.f27592b.lambda$startGroupCall$28(this.f27593c);
                return;
            case 1:
                this.f27592b.lambda$startGroupCall$22(this.f27593c);
                return;
            default:
                this.f27592b.lambda$startScreenCapture$59(this.f27593c);
                return;
        }
    }
}
