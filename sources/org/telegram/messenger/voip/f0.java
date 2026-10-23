package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19941a;
    public final VoIPService f19942b;
    public final TLRPC.TL_error f19943c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19941a = i10;
        this.f19942b = voIPService;
        this.f19943c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19941a) {
            case 0:
                this.f19942b.lambda$startGroupCall$28(this.f19943c);
                return;
            case 1:
                this.f19942b.lambda$startGroupCall$22(this.f19943c);
                return;
            default:
                this.f19942b.lambda$startScreenCapture$59(this.f19943c);
                return;
        }
    }
}
