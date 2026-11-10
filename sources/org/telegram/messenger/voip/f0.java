package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f26121a;
    public final VoIPService f26122b;
    public final TLRPC.TL_error f26123c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f26121a = i7;
        this.f26122b = voIPService;
        this.f26123c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26121a) {
            case 0:
                this.f26122b.lambda$startGroupCall$28(this.f26123c);
                return;
            case 1:
                this.f26122b.lambda$startGroupCall$22(this.f26123c);
                return;
            default:
                this.f26122b.lambda$startScreenCapture$59(this.f26123c);
                return;
        }
    }
}
