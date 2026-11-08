package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f26177a;
    public final VoIPService f26178b;
    public final TLRPC.Updates f26179c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f26177a = i7;
        this.f26178b = voIPService;
        this.f26179c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26177a) {
            case 0:
                this.f26178b.lambda$startConferenceGroupCall$38(this.f26179c, this.d);
                return;
            default:
                this.f26178b.lambda$startConferenceGroupCall$46(this.f26179c, this.d);
                return;
        }
    }
}
