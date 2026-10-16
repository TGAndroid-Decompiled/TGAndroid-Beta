package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f18464a;
    public final ConferenceCall f18465b;
    public final long f18466c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18464a = i10;
        this.f18465b = conferenceCall;
        this.f18466c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18464a) {
            case 0:
                this.f18465b.lambda$pull_outbound$5(this.f18466c, this.d, this.e);
                return;
            case 1:
                this.f18465b.lambda$kick$12(this.f18466c, this.d, this.e);
                return;
            default:
                this.f18465b.lambda$updateParticipants$10(this.f18466c, this.d, this.e);
                return;
        }
    }
}
