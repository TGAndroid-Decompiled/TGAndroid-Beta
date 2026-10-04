package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f19621a;
    public final VoIPService f19622b;
    public final TLRPC.Updates f19623c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f19621a = i10;
        this.f19622b = voIPService;
        this.f19623c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f19621a) {
            case 0:
                this.f19622b.lambda$startConferenceGroupCall$38(this.f19623c, this.d);
                return;
            default:
                this.f19622b.lambda$startConferenceGroupCall$46(this.f19623c, this.d);
                return;
        }
    }
}
