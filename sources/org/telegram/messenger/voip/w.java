package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17972a;
    public final VoIPService f17973b;
    public final TLRPC.Updates f17974c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17972a = i10;
        this.f17973b = voIPService;
        this.f17974c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17972a) {
            case 0:
                this.f17973b.lambda$startConferenceGroupCall$38(this.f17974c, this.d);
                return;
            default:
                this.f17973b.lambda$startConferenceGroupCall$46(this.f17974c, this.d);
                return;
        }
    }
}
