package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19910a;
    public final VoIPService f19911b;
    public final TLRPC.Updates f19912c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19910a = i10;
        this.f19911b = voIPService;
        this.f19912c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19910a) {
            case 0:
                this.f19911b.lambda$startConferenceGroupCall$38(this.f19912c, this.d);
                return;
            default:
                this.f19911b.lambda$startConferenceGroupCall$46(this.f19912c, this.d);
                return;
        }
    }
}
