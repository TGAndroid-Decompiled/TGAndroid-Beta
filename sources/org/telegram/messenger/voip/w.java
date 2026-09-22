package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17713a;
    public final VoIPService f17714b;
    public final TLRPC.Updates f17715c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17713a = i10;
        this.f17714b = voIPService;
        this.f17715c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17713a) {
            case 0:
                this.f17714b.lambda$startConferenceGroupCall$38(this.f17715c, this.d);
                return;
            default:
                this.f17714b.lambda$startConferenceGroupCall$46(this.f17715c, this.d);
                return;
        }
    }
}
