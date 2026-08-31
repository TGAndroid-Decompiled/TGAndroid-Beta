package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f20389a;
    public final ConferenceCall f20390b;
    public final long f20391c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f20389a = i10;
        this.f20390b = conferenceCall;
        this.f20391c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20389a) {
            case 0:
                this.f20390b.lambda$updateParticipants$11(this.f20391c, tLObject, tL_error);
                return;
            case 1:
                this.f20390b.lambda$pull_outbound$6(this.f20391c, tLObject, tL_error);
                return;
            default:
                this.f20390b.lambda$kick$13(this.f20391c, tLObject, tL_error);
                return;
        }
    }
}
