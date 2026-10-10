package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f19642a;
    public final VoIPService f19643b;
    public final TLRPC.Updates f19644c;
    public final long d;

    public x(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19642a = i10;
        this.f19643b = voIPService;
        this.f19644c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19642a) {
            case 0:
                this.f19643b.lambda$startConferenceGroupCall$38(this.f19644c, this.d);
                return;
            default:
                this.f19643b.lambda$startConferenceGroupCall$46(this.f19644c, this.d);
                return;
        }
    }
}
