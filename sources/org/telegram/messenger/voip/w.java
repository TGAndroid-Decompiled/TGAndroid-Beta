package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17961a;
    public final VoIPService f17962b;
    public final TLRPC.Updates f17963c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17961a = i10;
        this.f17962b = voIPService;
        this.f17963c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$startConferenceGroupCall$38(this.f17963c, this.d);
                return;
            default:
                this.f17962b.lambda$startConferenceGroupCall$46(this.f17963c, this.d);
                return;
        }
    }
}
