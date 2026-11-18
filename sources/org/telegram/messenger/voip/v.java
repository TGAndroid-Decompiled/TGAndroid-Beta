package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27559a;
    public final VoIPService f27560b;
    public final TLRPC.Updates f27561c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27559a = i7;
        this.f27560b = voIPService;
        this.f27561c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27559a) {
            case 0:
                this.f27560b.lambda$startConferenceGroupCall$38(this.f27561c, this.d);
                return;
            default:
                this.f27560b.lambda$startConferenceGroupCall$46(this.f27561c, this.d);
                return;
        }
    }
}
