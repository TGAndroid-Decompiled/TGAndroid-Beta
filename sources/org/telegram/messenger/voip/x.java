package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f19638a;
    public final VoIPService f19639b;
    public final TLRPC.Updates f19640c;
    public final long d;

    public x(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19638a = i10;
        this.f19639b = voIPService;
        this.f19640c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                this.f19639b.lambda$startConferenceGroupCall$38(this.f19640c, this.d);
                return;
            default:
                this.f19639b.lambda$startConferenceGroupCall$46(this.f19640c, this.d);
                return;
        }
    }
}
