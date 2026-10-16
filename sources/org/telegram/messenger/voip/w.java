package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f18567a;
    public final VoIPService f18568b;
    public final TLRPC.Updates f18569c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18567a = i10;
        this.f18568b = voIPService;
        this.f18569c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18567a) {
            case 0:
                this.f18568b.lambda$startConferenceGroupCall$38(this.f18569c, this.d);
                return;
            default:
                this.f18568b.lambda$startConferenceGroupCall$46(this.f18569c, this.d);
                return;
        }
    }
}
