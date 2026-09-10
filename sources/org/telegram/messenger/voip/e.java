package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e implements RequestDelegate {
    public final int f16709a;
    public final ConferenceCall f16710b;
    public final long f16711c;

    public e(ConferenceCall conferenceCall, long j3, int i10) {
        this.f16709a = i10;
        this.f16710b = conferenceCall;
        this.f16711c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16709a) {
            case 0:
                this.f16710b.lambda$updateParticipants$11(this.f16711c, tLObject, tL_error);
                return;
            case 1:
                this.f16710b.lambda$pull_outbound$6(this.f16711c, tLObject, tL_error);
                return;
            default:
                this.f16710b.lambda$kick$13(this.f16711c, tLObject, tL_error);
                return;
        }
    }
}
