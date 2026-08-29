package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f21932a;
    public final ConferenceCall f21933b;
    public final long f21934c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f21932a = i10;
        this.f21933b = conferenceCall;
        this.f21934c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21932a) {
            case 0:
                this.f21933b.lambda$updateParticipants$11(this.f21934c, tLObject, tL_error);
                return;
            case 1:
                this.f21933b.lambda$pull_outbound$6(this.f21934c, tLObject, tL_error);
                return;
            default:
                this.f21933b.lambda$kick$13(this.f21934c, tLObject, tL_error);
                return;
        }
    }
}
