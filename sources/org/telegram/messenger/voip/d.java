package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f21612a;
    public final ConferenceCall f21613b;
    public final long f21614c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f21612a = i10;
        this.f21613b = conferenceCall;
        this.f21614c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21612a) {
            case 0:
                this.f21613b.lambda$updateParticipants$11(this.f21614c, tLObject, tL_error);
                return;
            case 1:
                this.f21613b.lambda$pull_outbound$6(this.f21614c, tLObject, tL_error);
                return;
            default:
                this.f21613b.lambda$kick$13(this.f21614c, tLObject, tL_error);
                return;
        }
    }
}
