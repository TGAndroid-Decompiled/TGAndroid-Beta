package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19347a;
    public final ConferenceCall f19348b;
    public final long f19349c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19347a = i10;
        this.f19348b = conferenceCall;
        this.f19349c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19347a) {
            case 0:
                this.f19348b.lambda$updateParticipants$11(this.f19349c, tLObject, tL_error);
                return;
            case 1:
                this.f19348b.lambda$pull_outbound$6(this.f19349c, tLObject, tL_error);
                return;
            default:
                this.f19348b.lambda$kick$13(this.f19349c, tLObject, tL_error);
                return;
        }
    }
}
