package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class y implements Runnable {
    public final int f16804a;
    public final VoIPService f16805b;
    public final TLRPC.Updates f16806c;
    public final long d;

    public y(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f16804a = i10;
        this.f16805b = voIPService;
        this.f16806c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16804a) {
            case 0:
                this.f16805b.lambda$startConferenceGroupCall$38(this.f16806c, this.d);
                return;
            default:
                this.f16805b.lambda$startConferenceGroupCall$46(this.f16806c, this.d);
                return;
        }
    }
}
