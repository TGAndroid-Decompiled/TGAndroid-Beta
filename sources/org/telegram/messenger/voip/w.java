package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19405a;
    public final VoIPService f19406b;
    public final TLRPC.Updates f19407c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19405a = i10;
        this.f19406b = voIPService;
        this.f19407c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19405a) {
            case 0:
                this.f19406b.lambda$startConferenceGroupCall$38(this.f19407c, this.d);
                return;
            default:
                this.f19406b.lambda$startConferenceGroupCall$46(this.f19407c, this.d);
                return;
        }
    }
}
