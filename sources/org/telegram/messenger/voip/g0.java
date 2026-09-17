package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17663a;
    public final VoIPService f17664b;
    public final TLRPC.TL_error f17665c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17663a = i10;
        this.f17664b = voIPService;
        this.f17665c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                this.f17664b.lambda$startGroupCall$28(this.f17665c);
                return;
            case 1:
                this.f17664b.lambda$startGroupCall$22(this.f17665c);
                return;
            default:
                this.f17664b.lambda$startScreenCapture$59(this.f17665c);
                return;
        }
    }
}
