package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19994a;
    public final VoIPService f19995b;
    public final TLRPC.Updates f19996c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19994a = i10;
        this.f19995b = voIPService;
        this.f19996c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19994a) {
            case 0:
                this.f19995b.lambda$startConferenceGroupCall$38(this.f19996c, this.d);
                return;
            default:
                this.f19995b.lambda$startConferenceGroupCall$46(this.f19996c, this.d);
                return;
        }
    }
}
