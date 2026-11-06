package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f26072a;
    public final ConferenceCall f26073b;
    public final long f26074c;
    public final TLObject d;
    public final TLRPC.TL_error f26075e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f26072a = i7;
        this.f26073b = conferenceCall;
        this.f26074c = j3;
        this.d = tLObject;
        this.f26075e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26072a) {
            case 0:
                this.f26073b.lambda$pull_outbound$5(this.f26074c, this.d, this.f26075e);
                return;
            case 1:
                this.f26073b.lambda$kick$12(this.f26074c, this.d, this.f26075e);
                return;
            default:
                this.f26073b.lambda$updateParticipants$10(this.f26074c, this.d, this.f26075e);
                return;
        }
    }
}
