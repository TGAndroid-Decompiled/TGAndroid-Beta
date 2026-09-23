package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
public final class w implements Runnable {
    public final int f17702a;
    public final VoIPService f17703b;
    public final TLRPC.Updates f17704c;
    public final long d;

    public w(VoIPService voIPService, TLRPC.Updates updates, long j3, int i10) {
        this.f17702a = i10;
        this.f17703b = voIPService;
        this.f17704c = updates;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f17702a) {
            case 0:
                this.f17703b.lambda$startConferenceGroupCall$38(this.f17704c, this.d);
                return;
            default:
                this.f17703b.lambda$startConferenceGroupCall$46(this.f17704c, this.d);
                return;
        }
    }
}
