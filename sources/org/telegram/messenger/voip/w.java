package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f18831a;
    public final VoIPService f18832b;
    public final TLRPC.Updates f18833c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18831a = i10;
        this.f18832b = voIPService;
        this.f18833c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18831a) {
            case 0:
                this.f18832b.lambda$startConferenceGroupCall$38(this.f18833c, this.d);
                return;
            default:
                this.f18832b.lambda$startConferenceGroupCall$46(this.f18833c, this.d);
                return;
        }
    }
}
