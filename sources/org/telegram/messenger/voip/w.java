package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19406a;
    public final VoIPService f19407b;
    public final TLRPC.Updates f19408c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19406a = i10;
        this.f19407b = voIPService;
        this.f19408c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19406a) {
            case 0:
                this.f19407b.lambda$startConferenceGroupCall$38(this.f19408c, this.d);
                return;
            default:
                this.f19407b.lambda$startConferenceGroupCall$46(this.f19408c, this.d);
                return;
        }
    }
}
