package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19628a;
    public final VoIPService f19629b;
    public final TLRPC.Updates f19630c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19628a = i10;
        this.f19629b = voIPService;
        this.f19630c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19628a) {
            case 0:
                this.f19629b.lambda$startConferenceGroupCall$38(this.f19630c, this.d);
                return;
            default:
                this.f19629b.lambda$startConferenceGroupCall$46(this.f19630c, this.d);
                return;
        }
    }
}
