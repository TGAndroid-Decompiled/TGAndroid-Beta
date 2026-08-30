package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f18849a;
    public final VoIPService f18850b;
    public final TLRPC.Updates f18851c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j10, int i10) {
        this.f18849a = i10;
        this.f18850b = voIPService;
        this.f18851c = updates;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18849a) {
            case 0:
                this.f18850b.lambda$startConferenceGroupCall$38(this.f18851c, this.d);
                return;
            default:
                this.f18850b.lambda$startConferenceGroupCall$46(this.f18851c, this.d);
                return;
        }
    }
}
