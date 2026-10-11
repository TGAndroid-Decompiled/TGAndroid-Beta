package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19665a;
    public final VoIPService f19666b;
    public final TLRPC.Updates f19667c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19665a = i10;
        this.f19666b = voIPService;
        this.f19667c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                this.f19666b.lambda$startConferenceGroupCall$38(this.f19667c, this.d);
                return;
            default:
                this.f19666b.lambda$startConferenceGroupCall$46(this.f19667c, this.d);
                return;
        }
    }
}
