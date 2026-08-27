package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class e0 implements Runnable {

    public final int f21902a;

    public final VoIPService f21903b;

    public final TLRPC.TL_error f21904c;

    public e0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f21902a = i10;
        this.f21903b = voIPService;
        this.f21904c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21902a) {
            case 0:
                this.f21903b.lambda$startGroupCall$28(this.f21904c);
                break;
            case 1:
                this.f21903b.lambda$startGroupCall$22(this.f21904c);
                break;
            default:
                this.f21903b.lambda$startScreenCapture$59(this.f21904c);
                break;
        }
    }
}
