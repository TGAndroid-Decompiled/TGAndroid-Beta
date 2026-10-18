package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f19926a;
    public final VoIPService f19927b;
    public final TLRPC.Updates f19928c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19926a = i10;
        this.f19927b = voIPService;
        this.f19928c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19926a) {
            case 0:
                this.f19927b.lambda$startConferenceGroupCall$38(this.f19928c, this.d);
                return;
            default:
                this.f19927b.lambda$startConferenceGroupCall$46(this.f19928c, this.d);
                return;
        }
    }
}
