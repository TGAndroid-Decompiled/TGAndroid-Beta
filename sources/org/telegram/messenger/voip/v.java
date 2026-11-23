package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class v implements Runnable {
    public final int f27653a;
    public final VoIPService f27654b;
    public final TLRPC.Updates f27655c;
    public final long d;

    public v(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f27653a = i7;
        this.f27654b = voIPService;
        this.f27655c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f27653a) {
            case 0:
                this.f27654b.lambda$startConferenceGroupCall$38(this.f27655c, this.d);
                return;
            default:
                this.f27654b.lambda$startConferenceGroupCall$46(this.f27655c, this.d);
                return;
        }
    }
}
