package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19856a;
    public final ConferenceCall f19857b;
    public final long f19858c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f19856a = i10;
        this.f19857b = conferenceCall;
        this.f19858c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19856a) {
            case 0:
                this.f19857b.lambda$updateParticipants$11(this.f19858c, tLObject, tL_error);
                return;
            case 1:
                this.f19857b.lambda$pull_outbound$6(this.f19858c, tLObject, tL_error);
                return;
            default:
                this.f19857b.lambda$kick$13(this.f19858c, tLObject, tL_error);
                return;
        }
    }
}
