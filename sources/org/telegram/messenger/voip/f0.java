package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class f0 implements Runnable {
    public final int f26111a;
    public final VoIPService f26112b;
    public final TLRPC.TL_error f26113c;

    public f0(VoIPService voIPService, TLRPC.TL_error tL_error, int i7) {
        this.f26111a = i7;
        this.f26112b = voIPService;
        this.f26113c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26111a) {
            case 0:
                this.f26112b.lambda$startGroupCall$28(this.f26113c);
                return;
            case 1:
                this.f26112b.lambda$startGroupCall$22(this.f26113c);
                return;
            default:
                this.f26112b.lambda$startScreenCapture$59(this.f26113c);
                return;
        }
    }
}
