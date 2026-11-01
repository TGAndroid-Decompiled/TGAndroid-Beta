package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e implements RequestDelegate {
    public final int f18790a;
    public final ConferenceCall f18791b;
    public final long f18792c;

    public e(ConferenceCall conferenceCall, long j10, int i10) {
        this.f18790a = i10;
        this.f18791b = conferenceCall;
        this.f18792c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$updateParticipants$11(this.f18792c, tLObject, tL_error);
                return;
            case 1:
                this.f18791b.lambda$pull_outbound$6(this.f18792c, tLObject, tL_error);
                return;
            default:
                this.f18791b.lambda$kick$13(this.f18792c, tLObject, tL_error);
                return;
        }
    }
}
