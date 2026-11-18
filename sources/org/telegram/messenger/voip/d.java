package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f27476a;
    public final ConferenceCall f27477b;
    public final long f27478c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f27476a = i7;
        this.f27477b = conferenceCall;
        this.f27478c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27476a) {
            case 0:
                this.f27477b.lambda$updateParticipants$11(this.f27478c, tLObject, tL_error);
                return;
            case 1:
                this.f27477b.lambda$pull_outbound$6(this.f27478c, tLObject, tL_error);
                return;
            default:
                this.f27477b.lambda$kick$13(this.f27478c, tLObject, tL_error);
                return;
        }
    }
}
