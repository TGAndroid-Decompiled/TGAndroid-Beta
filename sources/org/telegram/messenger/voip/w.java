package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17957a;
    public final VoIPService f17958b;
    public final TLRPC.Updates f17959c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17957a = i10;
        this.f17958b = voIPService;
        this.f17959c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17957a) {
            case 0:
                this.f17958b.lambda$startConferenceGroupCall$38(this.f17959c, this.d);
                return;
            default:
                this.f17958b.lambda$startConferenceGroupCall$46(this.f17959c, this.d);
                return;
        }
    }
}
