package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f20485a;
    public final VoIPService f20486b;
    public final TLRPC.Updates f20487c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f20485a = i10;
        this.f20486b = voIPService;
        this.f20487c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20485a) {
            case 0:
                this.f20486b.lambda$startConferenceGroupCall$38(this.f20487c, this.d);
                return;
            default:
                this.f20486b.lambda$startConferenceGroupCall$46(this.f20487c, this.d);
                return;
        }
    }
}
