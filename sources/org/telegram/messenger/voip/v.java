package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27191a;
    public final VoIPService f27192b;
    public final TLRPC.Updates f27193c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27191a = i7;
        this.f27192b = voIPService;
        this.f27193c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27191a) {
            case 0:
                this.f27192b.lambda$startConferenceGroupCall$38(this.f27193c, this.d);
                return;
            default:
                this.f27192b.lambda$startConferenceGroupCall$46(this.f27193c, this.d);
                return;
        }
    }
}
