package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f17614a;
    public final ConferenceCall f17615b;
    public final long f17616c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f17614a = i10;
        this.f17615b = conferenceCall;
        this.f17616c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17614a) {
            case 0:
                this.f17615b.lambda$updateParticipants$11(this.f17616c, tLObject, tL_error);
                return;
            case 1:
                this.f17615b.lambda$pull_outbound$6(this.f17616c, tLObject, tL_error);
                return;
            default:
                this.f17615b.lambda$kick$13(this.f17616c, tLObject, tL_error);
                return;
        }
    }
}
