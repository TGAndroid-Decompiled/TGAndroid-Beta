package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19924a;
    public final ConferenceCall f19925b;
    public final long f19926c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f19924a = i10;
        this.f19925b = conferenceCall;
        this.f19926c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19924a) {
            case 0:
                this.f19925b.lambda$updateParticipants$11(this.f19926c, tLObject, tL_error);
                return;
            case 1:
                this.f19925b.lambda$pull_outbound$6(this.f19926c, tLObject, tL_error);
                return;
            default:
                this.f19925b.lambda$kick$13(this.f19926c, tLObject, tL_error);
                return;
        }
    }
}
