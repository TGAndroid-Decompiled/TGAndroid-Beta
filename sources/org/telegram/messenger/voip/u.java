package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f26181a;
    public final VoIPService f26182b;
    public final TLRPC.Updates f26183c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f26181a = i7;
        this.f26182b = voIPService;
        this.f26183c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26181a) {
            case 0:
                this.f26182b.lambda$startConferenceGroupCall$38(this.f26183c, this.d);
                return;
            default:
                this.f26182b.lambda$startConferenceGroupCall$46(this.f26183c, this.d);
                return;
        }
    }
}
