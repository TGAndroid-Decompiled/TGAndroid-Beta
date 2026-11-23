package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27559a;
    public final ConferenceCall f27560b;
    public final long f27561c;
    public final TLObject d;
    public final TLRPC.TL_error f27562e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27559a = i7;
        this.f27560b = conferenceCall;
        this.f27561c = j3;
        this.d = tLObject;
        this.f27562e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27559a) {
            case 0:
                this.f27560b.lambda$pull_outbound$5(this.f27561c, this.d, this.f27562e);
                return;
            case 1:
                this.f27560b.lambda$kick$12(this.f27561c, this.d, this.f27562e);
                return;
            default:
                this.f27560b.lambda$updateParticipants$10(this.f27561c, this.d, this.f27562e);
                return;
        }
    }
}
