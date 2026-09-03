package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f20375a;
    public final ConferenceCall f20376b;
    public final long f20377c;
    public final TLObject d;
    public final TLRPC.TL_error f20378e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f20375a = i10;
        this.f20376b = conferenceCall;
        this.f20377c = j10;
        this.d = tLObject;
        this.f20378e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20375a) {
            case 0:
                this.f20376b.lambda$pull_outbound$5(this.f20377c, this.d, this.f20378e);
                return;
            case 1:
                this.f20376b.lambda$kick$12(this.f20377c, this.d, this.f20378e);
                return;
            default:
                this.f20376b.lambda$updateParticipants$10(this.f20377c, this.d, this.f20378e);
                return;
        }
    }
}
