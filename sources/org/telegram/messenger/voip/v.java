package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27190a;
    public final VoIPService f27191b;
    public final TLRPC.Updates f27192c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27190a = i7;
        this.f27191b = voIPService;
        this.f27192c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27190a) {
            case 0:
                this.f27191b.lambda$startConferenceGroupCall$38(this.f27192c, this.d);
                return;
            default:
                this.f27191b.lambda$startConferenceGroupCall$46(this.f27192c, this.d);
                return;
        }
    }
}
