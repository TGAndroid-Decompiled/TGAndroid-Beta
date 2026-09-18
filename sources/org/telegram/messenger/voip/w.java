package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17904a;
    public final VoIPService f17905b;
    public final TLRPC.Updates f17906c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17904a = i10;
        this.f17905b = voIPService;
        this.f17906c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                this.f17905b.lambda$startConferenceGroupCall$38(this.f17906c, this.d);
                return;
            default:
                this.f17905b.lambda$startConferenceGroupCall$46(this.f17906c, this.d);
                return;
        }
    }
}
