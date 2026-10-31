package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e implements RequestDelegate {
    public final int f18630a;
    public final ConferenceCall f18631b;
    public final long f18632c;

    public e(ConferenceCall conferenceCall, long j10, int i10) {
        this.f18630a = i10;
        this.f18631b = conferenceCall;
        this.f18632c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18630a) {
            case 0:
                this.f18631b.lambda$updateParticipants$11(this.f18632c, tLObject, tL_error);
                return;
            case 1:
                this.f18631b.lambda$pull_outbound$6(this.f18632c, tLObject, tL_error);
                return;
            default:
                this.f18631b.lambda$kick$13(this.f18632c, tLObject, tL_error);
                return;
        }
    }
}
