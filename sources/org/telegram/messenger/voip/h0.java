package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19563a;
    public final VoIPService f19564b;
    public final TLRPC.TL_error f19565c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19563a = i10;
        this.f19564b = voIPService;
        this.f19565c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19563a) {
            case 0:
                this.f19564b.lambda$startGroupCall$28(this.f19565c);
                return;
            case 1:
                this.f19564b.lambda$startGroupCall$22(this.f19565c);
                return;
            default:
                this.f19564b.lambda$startScreenCapture$59(this.f19565c);
                return;
        }
    }
}
