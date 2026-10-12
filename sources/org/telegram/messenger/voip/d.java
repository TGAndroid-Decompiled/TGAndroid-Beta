package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f18779a;
    public final ConferenceCall f18780b;
    public final long f18781c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f18779a = i10;
        this.f18780b = conferenceCall;
        this.f18781c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18779a) {
            case 0:
                this.f18780b.lambda$updateParticipants$11(this.f18781c, tLObject, tL_error);
                return;
            case 1:
                this.f18780b.lambda$pull_outbound$6(this.f18781c, tLObject, tL_error);
                return;
            default:
                this.f18780b.lambda$kick$13(this.f18781c, tLObject, tL_error);
                return;
        }
    }
}
