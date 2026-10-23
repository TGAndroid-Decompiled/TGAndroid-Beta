package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19934a;
    public final VoIPService f19935b;
    public final TLRPC.Updates f19936c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19934a = i10;
        this.f19935b = voIPService;
        this.f19936c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.lambda$startConferenceGroupCall$38(this.f19936c, this.d);
                return;
            default:
                this.f19935b.lambda$startConferenceGroupCall$46(this.f19936c, this.d);
                return;
        }
    }
}
