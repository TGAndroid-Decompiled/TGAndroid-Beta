package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19309a;
    public final ConferenceCall f19310b;
    public final long f19311c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19309a = i10;
        this.f19310b = conferenceCall;
        this.f19311c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19309a) {
            case 0:
                this.f19310b.lambda$updateParticipants$11(this.f19311c, tLObject, tL_error);
                return;
            case 1:
                this.f19310b.lambda$pull_outbound$6(this.f19311c, tLObject, tL_error);
                return;
            default:
                this.f19310b.lambda$kick$13(this.f19311c, tLObject, tL_error);
                return;
        }
    }
}
