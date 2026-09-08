package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19457a;
    public final VoIPService f19458b;
    public final TLRPC.Updates f19459c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19457a = i10;
        this.f19458b = voIPService;
        this.f19459c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19457a) {
            case 0:
                this.f19458b.lambda$startConferenceGroupCall$38(this.f19459c, this.d);
                return;
            default:
                this.f19458b.lambda$startConferenceGroupCall$46(this.f19459c, this.d);
                return;
        }
    }
}
