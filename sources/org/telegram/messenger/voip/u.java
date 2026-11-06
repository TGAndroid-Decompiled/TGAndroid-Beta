package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f26163a;
    public final VoIPService f26164b;
    public final TLRPC.Updates f26165c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j3, int i7) {
        this.f26163a = i7;
        this.f26164b = voIPService;
        this.f26165c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26163a) {
            case 0:
                this.f26164b.lambda$startConferenceGroupCall$38(this.f26165c, this.d);
                return;
            default:
                this.f26164b.lambda$startConferenceGroupCall$46(this.f26165c, this.d);
                return;
        }
    }
}
