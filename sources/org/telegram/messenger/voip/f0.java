package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f19852a;
    public final VoIPService f19853b;
    public final TLRPC.TL_error f19854c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i10) {
        this.f19852a = i10;
        this.f19853b = voIPService;
        this.f19854c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19852a) {
            case 0:
                this.f19853b.lambda$startGroupCall$28(this.f19854c);
                return;
            case 1:
                this.f19853b.lambda$startGroupCall$22(this.f19854c);
                return;
            default:
                this.f19853b.lambda$startScreenCapture$59(this.f19854c);
                return;
        }
    }
}
