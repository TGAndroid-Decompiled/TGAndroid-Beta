package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17988a;
    public final VoIPService f17989b;
    public final TLRPC.Updates f17990c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17988a = i10;
        this.f17989b = voIPService;
        this.f17990c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17988a) {
            case 0:
                this.f17989b.lambda$startConferenceGroupCall$38(this.f17990c, this.d);
                return;
            default:
                this.f17989b.lambda$startConferenceGroupCall$46(this.f17990c, this.d);
                return;
        }
    }
}
