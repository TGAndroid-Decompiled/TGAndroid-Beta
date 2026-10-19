package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19919a;
    public final VoIPService f19920b;
    public final TLRPC.Updates f19921c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19919a = i10;
        this.f19920b = voIPService;
        this.f19921c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19919a) {
            case 0:
                this.f19920b.lambda$startConferenceGroupCall$38(this.f19921c, this.d);
                return;
            default:
                this.f19920b.lambda$startConferenceGroupCall$46(this.f19921c, this.d);
                return;
        }
    }
}
