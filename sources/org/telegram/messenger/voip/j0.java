package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class j0 implements Runnable {
    public final int f16743a;
    public final VoIPService f16744b;
    public final TLRPC.TL_error f16745c;

    public j0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f16743a = i10;
        this.f16744b = voIPService;
        this.f16745c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16743a) {
            case 0:
                this.f16744b.lambda$startGroupCall$28(this.f16745c);
                return;
            case 1:
                this.f16744b.lambda$startGroupCall$22(this.f16745c);
                return;
            default:
                this.f16744b.lambda$startScreenCapture$59(this.f16745c);
                return;
        }
    }
}
