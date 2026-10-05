package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class h0 implements Runnable {
    public final int f19561a;
    public final VoIPService f19562b;
    public final TLRPC.TL_error f19563c;

    public h0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19561a = i10;
        this.f19562b = voIPService;
        this.f19563c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19561a) {
            case 0:
                this.f19562b.lambda$startGroupCall$28(this.f19563c);
                return;
            case 1:
                this.f19562b.lambda$startGroupCall$22(this.f19563c);
                return;
            default:
                this.f19562b.lambda$startScreenCapture$59(this.f19563c);
                return;
        }
    }
}
