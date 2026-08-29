package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f22020a;
    public final VoIPService f22021b;
    public final TLRPC.Updates f22022c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f22020a = i10;
        this.f22021b = voIPService;
        this.f22022c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f22020a) {
            case 0:
                this.f22021b.lambda$startConferenceGroupCall$38(this.f22022c, this.d);
                return;
            default:
                this.f22021b.lambda$startConferenceGroupCall$46(this.f22022c, this.d);
                return;
        }
    }
}
