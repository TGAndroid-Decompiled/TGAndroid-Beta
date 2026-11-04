package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class t implements Runnable {
    public final int f26059a;
    public final VoIPService f26060b;
    public final TLRPC.Updates f26061c;
    public final long d;

    public t(VoIPService voIPService, TLRPC.Updates updates, long j10, int i3) {
        this.f26059a = i3;
        this.f26060b = voIPService;
        this.f26061c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26059a) {
            case 0:
                this.f26060b.lambda$startConferenceGroupCall$38(this.f26061c, this.d);
                return;
            default:
                this.f26060b.lambda$startConferenceGroupCall$46(this.f26061c, this.d);
                return;
        }
    }
}
