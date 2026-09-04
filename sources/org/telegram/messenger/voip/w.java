package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19430a;
    public final VoIPService f19431b;
    public final TLRPC.Updates f19432c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19430a = i10;
        this.f19431b = voIPService;
        this.f19432c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19430a) {
            case 0:
                this.f19431b.lambda$startConferenceGroupCall$38(this.f19432c, this.d);
                return;
            default:
                this.f19431b.lambda$startConferenceGroupCall$46(this.f19432c, this.d);
                return;
        }
    }
}
