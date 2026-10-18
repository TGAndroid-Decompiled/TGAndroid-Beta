package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19913a;
    public final VoIPService f19914b;
    public final TLRPC.Updates f19915c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19913a = i10;
        this.f19914b = voIPService;
        this.f19915c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19913a) {
            case 0:
                this.f19914b.lambda$startConferenceGroupCall$38(this.f19915c, this.d);
                return;
            default:
                this.f19914b.lambda$startConferenceGroupCall$46(this.f19915c, this.d);
                return;
        }
    }
}
