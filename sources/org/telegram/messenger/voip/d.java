package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19531a;
    public final ConferenceCall f19532b;
    public final long f19533c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19531a = i10;
        this.f19532b = conferenceCall;
        this.f19533c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19531a) {
            case 0:
                this.f19532b.lambda$updateParticipants$11(this.f19533c, tLObject, tL_error);
                return;
            case 1:
                this.f19532b.lambda$pull_outbound$6(this.f19533c, tLObject, tL_error);
                return;
            default:
                this.f19532b.lambda$kick$13(this.f19533c, tLObject, tL_error);
                return;
        }
    }
}
