package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19471a;
    public final VoIPService f19472b;
    public final TLRPC.Updates f19473c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19471a = i10;
        this.f19472b = voIPService;
        this.f19473c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19471a) {
            case 0:
                this.f19472b.lambda$startConferenceGroupCall$38(this.f19473c, this.d);
                return;
            default:
                this.f19472b.lambda$startConferenceGroupCall$46(this.f19473c, this.d);
                return;
        }
    }
}
