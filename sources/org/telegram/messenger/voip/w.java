package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17718a;
    public final VoIPService f17719b;
    public final TLRPC.Updates f17720c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17718a = i10;
        this.f17719b = voIPService;
        this.f17720c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17718a) {
            case 0:
                this.f17719b.lambda$startConferenceGroupCall$38(this.f17720c, this.d);
                return;
            default:
                this.f17719b.lambda$startConferenceGroupCall$46(this.f17720c, this.d);
                return;
        }
    }
}
