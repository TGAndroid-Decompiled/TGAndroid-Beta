package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class u implements Runnable {
    public final int f19931a;
    public final VoIPService f19932b;
    public final TLRPC.Updates f19933c;
    public final long d;

    public u(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f19931a = i10;
        this.f19932b = voIPService;
        this.f19933c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19931a) {
            case 0:
                this.f19932b.lambda$startConferenceGroupCall$38(this.f19933c, this.d);
                return;
            default:
                this.f19932b.lambda$startConferenceGroupCall$46(this.f19933c, this.d);
                return;
        }
    }
}
