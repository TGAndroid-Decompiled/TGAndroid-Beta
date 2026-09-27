package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17955a;
    public final VoIPService f17956b;
    public final TLRPC.Updates f17957c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17955a = i10;
        this.f17956b = voIPService;
        this.f17957c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                this.f17956b.lambda$startConferenceGroupCall$38(this.f17957c, this.d);
                return;
            default:
                this.f17956b.lambda$startConferenceGroupCall$46(this.f17957c, this.d);
                return;
        }
    }
}
