package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19360a;
    public final VoIPService f19361b;
    public final TLRPC.TL_error f19362c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19360a = i10;
        this.f19361b = voIPService;
        this.f19362c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$startGroupCall$28(this.f19362c);
                return;
            case 1:
                this.f19361b.lambda$startGroupCall$22(this.f19362c);
                return;
            default:
                this.f19361b.lambda$startScreenCapture$59(this.f19362c);
                return;
        }
    }
}
