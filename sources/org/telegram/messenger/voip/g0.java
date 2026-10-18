package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class g0 implements Runnable {
    public final int f19868a;
    public final VoIPService f19869b;
    public final TLRPC.TL_error f19870c;

    public g0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19868a = i10;
        this.f19869b = voIPService;
        this.f19870c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19868a) {
            case 0:
                this.f19869b.lambda$startGroupCall$28(this.f19870c);
                return;
            case 1:
                this.f19869b.lambda$startGroupCall$22(this.f19870c);
                return;
            default:
                this.f19869b.lambda$startScreenCapture$59(this.f19870c);
                return;
        }
    }
}
