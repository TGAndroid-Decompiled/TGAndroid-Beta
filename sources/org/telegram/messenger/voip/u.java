package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;

public final class u implements Runnable {

    public final int f21978a;

    public final VoIPService f21979b;

    public final TLRPC.Updates f21980c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f21978a = i10;
        this.f21979b = voIPService;
        this.f21980c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21978a) {
            case 0:
                this.f21979b.lambda$startConferenceGroupCall$38(this.f21980c, this.d);
                break;
            default:
                this.f21979b.lambda$startConferenceGroupCall$46(this.f21980c, this.d);
                break;
        }
    }
}
