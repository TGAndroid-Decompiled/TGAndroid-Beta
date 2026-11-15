package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f27110a;
    public final ConferenceCall f27111b;
    public final long f27112c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f27110a = i7;
        this.f27111b = conferenceCall;
        this.f27112c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27110a) {
            case 0:
                this.f27111b.lambda$updateParticipants$11(this.f27112c, tLObject, tL_error);
                return;
            case 1:
                this.f27111b.lambda$pull_outbound$6(this.f27112c, tLObject, tL_error);
                return;
            default:
                this.f27111b.lambda$kick$13(this.f27112c, tLObject, tL_error);
                return;
        }
    }
}
