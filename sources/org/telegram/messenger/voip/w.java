package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17971a;
    public final VoIPService f17972b;
    public final TLRPC.Updates f17973c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17971a = i10;
        this.f17972b = voIPService;
        this.f17973c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17971a) {
            case 0:
                this.f17972b.lambda$startConferenceGroupCall$38(this.f17973c, this.d);
                return;
            default:
                this.f17972b.lambda$startConferenceGroupCall$46(this.f17973c, this.d);
                return;
        }
    }
}
