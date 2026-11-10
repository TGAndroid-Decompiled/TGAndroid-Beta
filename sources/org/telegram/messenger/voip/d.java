package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f26105a;
    public final ConferenceCall f26106b;
    public final long f26107c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f26105a = i7;
        this.f26106b = conferenceCall;
        this.f26107c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26105a) {
            case 0:
                this.f26106b.lambda$updateParticipants$11(this.f26107c, tLObject, tL_error);
                return;
            case 1:
                this.f26106b.lambda$pull_outbound$6(this.f26107c, tLObject, tL_error);
                return;
            default:
                this.f26106b.lambda$kick$13(this.f26107c, tLObject, tL_error);
                return;
        }
    }
}
