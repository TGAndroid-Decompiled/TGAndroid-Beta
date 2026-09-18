package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f17840a;
    public final VoIPService f17841b;
    public final TLRPC.TL_error f17842c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f17840a = i10;
        this.f17841b = voIPService;
        this.f17842c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17840a) {
            case 0:
                this.f17841b.lambda$startGroupCall$28(this.f17842c);
                return;
            case 1:
                this.f17841b.lambda$startGroupCall$22(this.f17842c);
                return;
            default:
                this.f17841b.lambda$startScreenCapture$59(this.f17842c);
                return;
        }
    }
}
