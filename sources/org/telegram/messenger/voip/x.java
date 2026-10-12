package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class x implements Runnable {
    public final int f18873a;
    public final VoIPService f18874b;
    public final TLRPC.Updates f18875c;
    public final long d;

    public x(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18873a = i10;
        this.f18874b = voIPService;
        this.f18875c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18873a) {
            case 0:
                this.f18874b.lambda$startConferenceGroupCall$38(this.f18875c, this.d);
                return;
            default:
                this.f18874b.lambda$startConferenceGroupCall$46(this.f18875c, this.d);
                return;
        }
    }
}
