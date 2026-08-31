package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f20483a;
    public final VoIPService f20484b;
    public final TLRPC.Updates f20485c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f20483a = i10;
        this.f20484b = voIPService;
        this.f20485c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20483a) {
            case 0:
                this.f20484b.lambda$startConferenceGroupCall$38(this.f20485c, this.d);
                return;
            default:
                this.f20484b.lambda$startConferenceGroupCall$46(this.f20485c, this.d);
                return;
        }
    }
}
