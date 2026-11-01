package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f18880a;
    public final VoIPService f18881b;
    public final TLRPC.Updates f18882c;
    public final long d;

    public x(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18880a = i10;
        this.f18881b = voIPService;
        this.f18882c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18880a) {
            case 0:
                this.f18881b.lambda$startConferenceGroupCall$38(this.f18882c, this.d);
                return;
            default:
                this.f18881b.lambda$startConferenceGroupCall$46(this.f18882c, this.d);
                return;
        }
    }
}
