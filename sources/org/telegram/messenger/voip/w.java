package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17942a;
    public final VoIPService f17943b;
    public final TLRPC.Updates f17944c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17942a = i10;
        this.f17943b = voIPService;
        this.f17944c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17942a) {
            case 0:
                this.f17943b.lambda$startConferenceGroupCall$38(this.f17944c, this.d);
                return;
            default:
                this.f17943b.lambda$startConferenceGroupCall$46(this.f17944c, this.d);
                return;
        }
    }
}
