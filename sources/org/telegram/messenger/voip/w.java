package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17946a;
    public final VoIPService f17947b;
    public final TLRPC.Updates f17948c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17946a = i10;
        this.f17947b = voIPService;
        this.f17948c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17946a) {
            case 0:
                this.f17947b.lambda$startConferenceGroupCall$38(this.f17948c, this.d);
                return;
            default:
                this.f17947b.lambda$startConferenceGroupCall$46(this.f17948c, this.d);
                return;
        }
    }
}
