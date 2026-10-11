package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19629a;
    public final VoIPService f19630b;
    public final TLRPC.Updates f19631c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19629a = i10;
        this.f19630b = voIPService;
        this.f19631c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19629a) {
            case 0:
                this.f19630b.lambda$startConferenceGroupCall$38(this.f19631c, this.d);
                return;
            default:
                this.f19630b.lambda$startConferenceGroupCall$46(this.f19631c, this.d);
                return;
        }
    }
}
