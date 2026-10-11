package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19566a;
    public final VoIPService f19567b;
    public final TLRPC.TL_error f19568c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19566a = i10;
        this.f19567b = voIPService;
        this.f19568c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19566a) {
            case 0:
                this.f19567b.lambda$startGroupCall$28(this.f19568c);
                return;
            case 1:
                this.f19567b.lambda$startGroupCall$22(this.f19568c);
                return;
            default:
                this.f19567b.lambda$startScreenCapture$59(this.f19568c);
                return;
        }
    }
}
