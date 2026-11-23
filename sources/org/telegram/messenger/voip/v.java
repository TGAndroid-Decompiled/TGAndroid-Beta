package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27548a;
    public final VoIPService f27549b;
    public final TLRPC.Updates f27550c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27548a = i7;
        this.f27549b = voIPService;
        this.f27550c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27548a) {
            case 0:
                this.f27549b.lambda$startConferenceGroupCall$38(this.f27550c, this.d);
                return;
            default:
                this.f27549b.lambda$startConferenceGroupCall$46(this.f27550c, this.d);
                return;
        }
    }
}
