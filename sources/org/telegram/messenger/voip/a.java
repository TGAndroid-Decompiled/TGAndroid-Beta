package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27418a;
    public final ConferenceCall f27419b;
    public final long f27420c;
    public final TLObject d;
    public final TLRPC.TL_error f27421e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27418a = i7;
        this.f27419b = conferenceCall;
        this.f27420c = j3;
        this.d = tLObject;
        this.f27421e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27418a) {
            case 0:
                this.f27419b.lambda$pull_outbound$5(this.f27420c, this.d, this.f27421e);
                return;
            case 1:
                this.f27419b.lambda$kick$12(this.f27420c, this.d, this.f27421e);
                return;
            default:
                this.f27419b.lambda$updateParticipants$10(this.f27420c, this.d, this.f27421e);
                return;
        }
    }
}
