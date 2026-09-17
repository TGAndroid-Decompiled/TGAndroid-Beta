package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19374a;
    public final ConferenceCall f19375b;
    public final long f19376c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19374a = i10;
        this.f19375b = conferenceCall;
        this.f19376c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19374a) {
            case 0:
                this.f19375b.lambda$updateParticipants$11(this.f19376c, tLObject, tL_error);
                return;
            case 1:
                this.f19375b.lambda$pull_outbound$6(this.f19376c, tLObject, tL_error);
                return;
            default:
                this.f19375b.lambda$kick$13(this.f19376c, tLObject, tL_error);
                return;
        }
    }
}
