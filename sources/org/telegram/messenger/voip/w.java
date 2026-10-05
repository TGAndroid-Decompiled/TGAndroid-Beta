package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19626a;
    public final VoIPService f19627b;
    public final TLRPC.Updates f19628c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19626a = i10;
        this.f19627b = voIPService;
        this.f19628c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19626a) {
            case 0:
                this.f19627b.lambda$startConferenceGroupCall$38(this.f19628c, this.d);
                return;
            default:
                this.f19627b.lambda$startConferenceGroupCall$46(this.f19628c, this.d);
                return;
        }
    }
}
