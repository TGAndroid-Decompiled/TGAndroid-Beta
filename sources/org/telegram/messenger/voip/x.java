package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f18720a;
    public final VoIPService f18721b;
    public final TLRPC.Updates f18722c;
    public final long d;

    public x(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18720a = i10;
        this.f18721b = voIPService;
        this.f18722c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18720a) {
            case 0:
                this.f18721b.lambda$startConferenceGroupCall$38(this.f18722c, this.d);
                return;
            default:
                this.f18721b.lambda$startConferenceGroupCall$46(this.f18722c, this.d);
                return;
        }
    }
}
