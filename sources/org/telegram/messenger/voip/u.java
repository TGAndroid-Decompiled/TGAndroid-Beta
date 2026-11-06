package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f26171a;
    public final VoIPService f26172b;
    public final TLRPC.Updates f26173c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f26171a = i7;
        this.f26172b = voIPService;
        this.f26173c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26171a) {
            case 0:
                this.f26172b.lambda$startConferenceGroupCall$38(this.f26173c, this.d);
                return;
            default:
                this.f26172b.lambda$startConferenceGroupCall$46(this.f26173c, this.d);
                return;
        }
    }
}
