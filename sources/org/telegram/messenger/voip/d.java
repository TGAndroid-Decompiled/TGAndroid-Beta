package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f17639a;
    public final ConferenceCall f17640b;
    public final long f17641c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f17639a = i10;
        this.f17640b = conferenceCall;
        this.f17641c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17639a) {
            case 0:
                this.f17640b.lambda$updateParticipants$11(this.f17641c, tLObject, tL_error);
                return;
            case 1:
                this.f17640b.lambda$pull_outbound$6(this.f17641c, tLObject, tL_error);
                return;
            default:
                this.f17640b.lambda$kick$13(this.f17641c, tLObject, tL_error);
                return;
        }
    }
}
