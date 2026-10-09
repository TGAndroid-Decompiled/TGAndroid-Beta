package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class i0 implements Runnable {
    public final int f19573a;
    public final VoIPService f19574b;
    public final TLRPC.TL_error f19575c;

    public i0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19573a = i10;
        this.f19574b = voIPService;
        this.f19575c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19573a) {
            case 0:
                this.f19574b.lambda$startGroupCall$28(this.f19575c);
                return;
            case 1:
                this.f19574b.lambda$startGroupCall$22(this.f19575c);
                return;
            default:
                this.f19574b.lambda$startScreenCapture$59(this.f19575c);
                return;
        }
    }
}
