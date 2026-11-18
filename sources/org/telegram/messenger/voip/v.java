package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27557a;
    public final VoIPService f27558b;
    public final TLRPC.Updates f27559c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27557a = i7;
        this.f27558b = voIPService;
        this.f27559c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27557a) {
            case 0:
                this.f27558b.lambda$startConferenceGroupCall$38(this.f27559c, this.d);
                return;
            default:
                this.f27558b.lambda$startConferenceGroupCall$46(this.f27559c, this.d);
                return;
        }
    }
}
