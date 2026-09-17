package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17727a;
    public final VoIPService f17728b;
    public final TLRPC.Updates f17729c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17727a = i10;
        this.f17728b = voIPService;
        this.f17729c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17727a) {
            case 0:
                this.f17728b.lambda$startConferenceGroupCall$38(this.f17729c, this.d);
                return;
            default:
                this.f17728b.lambda$startConferenceGroupCall$46(this.f17729c, this.d);
                return;
        }
    }
}
