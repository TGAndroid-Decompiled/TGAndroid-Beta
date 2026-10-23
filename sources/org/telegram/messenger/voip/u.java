package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19999a;
    public final VoIPService f20000b;
    public final TLRPC.Updates f20001c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19999a = i10;
        this.f20000b = voIPService;
        this.f20001c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19999a) {
            case 0:
                this.f20000b.lambda$startConferenceGroupCall$38(this.f20001c, this.d);
                return;
            default:
                this.f20000b.lambda$startConferenceGroupCall$46(this.f20001c, this.d);
                return;
        }
    }
}
