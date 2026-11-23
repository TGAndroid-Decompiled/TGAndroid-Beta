package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27512a;
    public final VoIPService f27513b;
    public final TLRPC.Updates f27514c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27512a = i7;
        this.f27513b = voIPService;
        this.f27514c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27512a) {
            case 0:
                this.f27513b.lambda$startConferenceGroupCall$38(this.f27514c, this.d);
                return;
            default:
                this.f27513b.lambda$startConferenceGroupCall$46(this.f27514c, this.d);
                return;
        }
    }
}
