package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19838a;
    public final ConferenceCall f19839b;
    public final long f19840c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f19838a = i10;
        this.f19839b = conferenceCall;
        this.f19840c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19838a) {
            case 0:
                this.f19839b.lambda$updateParticipants$11(this.f19840c, tLObject, tL_error);
                return;
            case 1:
                this.f19839b.lambda$pull_outbound$6(this.f19840c, tLObject, tL_error);
                return;
            default:
                this.f19839b.lambda$kick$13(this.f19840c, tLObject, tL_error);
                return;
        }
    }
}
