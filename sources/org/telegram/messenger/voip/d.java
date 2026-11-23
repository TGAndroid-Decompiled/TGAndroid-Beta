package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f27572a;
    public final ConferenceCall f27573b;
    public final long f27574c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f27572a = i7;
        this.f27573b = conferenceCall;
        this.f27574c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27572a) {
            case 0:
                this.f27573b.lambda$updateParticipants$11(this.f27574c, tLObject, tL_error);
                return;
            case 1:
                this.f27573b.lambda$pull_outbound$6(this.f27574c, tLObject, tL_error);
                return;
            default:
                this.f27573b.lambda$kick$13(this.f27574c, tLObject, tL_error);
                return;
        }
    }
}
