package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class k0 implements Runnable {
    public final int f18831a;
    public final VoIPService f18832b;
    public final TLRPC.TL_error f18833c;

    public k0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f18831a = i10;
        this.f18832b = voIPService;
        this.f18833c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18831a) {
            case 0:
                this.f18832b.lambda$startGroupCall$28(this.f18833c);
                return;
            case 1:
                this.f18832b.lambda$startGroupCall$22(this.f18833c);
                return;
            default:
                this.f18832b.lambda$startScreenCapture$59(this.f18833c);
                return;
        }
    }
}
