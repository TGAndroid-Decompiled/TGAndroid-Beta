package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f19915a;
    public final VoIPService f19916b;
    public final TLRPC.Updates f19917c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19915a = i10;
        this.f19916b = voIPService;
        this.f19917c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19915a) {
            case 0:
                this.f19916b.lambda$startConferenceGroupCall$38(this.f19917c, this.d);
                return;
            default:
                this.f19916b.lambda$startConferenceGroupCall$46(this.f19917c, this.d);
                return;
        }
    }
}
