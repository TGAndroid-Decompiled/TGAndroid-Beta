package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f21694a;
    public final VoIPService f21695b;
    public final TLRPC.Updates f21696c;
    public final long d;

    public t(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f21694a = i10;
        this.f21695b = voIPService;
        this.f21696c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21694a) {
            case 0:
                this.f21695b.lambda$startConferenceGroupCall$38(this.f21696c, this.d);
                return;
            default:
                this.f21695b.lambda$startConferenceGroupCall$46(this.f21696c, this.d);
                return;
        }
    }
}
