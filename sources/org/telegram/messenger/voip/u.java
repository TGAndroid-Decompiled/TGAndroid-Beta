package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f21954a;
    public final VoIPService f21955b;
    public final TLRPC.Updates f21956c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i9) {
        this.f21954a = i9;
        this.f21955b = voIPService;
        this.f21956c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21954a) {
            case 0:
                this.f21955b.lambda$startConferenceGroupCall$38(this.f21956c, this.d);
                return;
            default:
                this.f21955b.lambda$startConferenceGroupCall$46(this.f21956c, this.d);
                return;
        }
    }
}
