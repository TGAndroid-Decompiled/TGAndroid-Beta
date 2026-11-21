package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27585a;
    public final VoIPService f27586b;
    public final TLRPC.Updates f27587c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27585a = i7;
        this.f27586b = voIPService;
        this.f27587c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27585a) {
            case 0:
                this.f27586b.lambda$startConferenceGroupCall$38(this.f27587c, this.d);
                return;
            default:
                this.f27586b.lambda$startConferenceGroupCall$46(this.f27587c, this.d);
                return;
        }
    }
}
