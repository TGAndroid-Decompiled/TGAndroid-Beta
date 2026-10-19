package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19916a;
    public final VoIPService f19917b;
    public final TLRPC.Updates f19918c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19916a = i10;
        this.f19917b = voIPService;
        this.f19918c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19916a) {
            case 0:
                this.f19917b.lambda$startConferenceGroupCall$38(this.f19918c, this.d);
                return;
            default:
                this.f19917b.lambda$startConferenceGroupCall$46(this.f19918c, this.d);
                return;
        }
    }
}
