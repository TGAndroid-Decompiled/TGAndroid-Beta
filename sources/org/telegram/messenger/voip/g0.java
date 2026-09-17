package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19401a;
    public final VoIPService f19402b;
    public final TLRPC.TL_error f19403c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19401a = i10;
        this.f19402b = voIPService;
        this.f19403c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19401a) {
            case 0:
                this.f19402b.lambda$startGroupCall$28(this.f19403c);
                return;
            case 1:
                this.f19402b.lambda$startGroupCall$22(this.f19403c);
                return;
            default:
                this.f19402b.lambda$startScreenCapture$59(this.f19403c);
                return;
        }
    }
}
