package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f26117a;
    public final VoIPService f26118b;
    public final TLRPC.TL_error f26119c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f26117a = i7;
        this.f26118b = voIPService;
        this.f26119c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26117a) {
            case 0:
                this.f26118b.lambda$startGroupCall$28(this.f26119c);
                return;
            case 1:
                this.f26118b.lambda$startGroupCall$22(this.f26119c);
                return;
            default:
                this.f26118b.lambda$startScreenCapture$59(this.f26119c);
                return;
        }
    }
}
