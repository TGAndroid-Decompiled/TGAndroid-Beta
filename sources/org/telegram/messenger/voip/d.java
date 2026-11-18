package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f27478a;
    public final ConferenceCall f27479b;
    public final long f27480c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f27478a = i7;
        this.f27479b = conferenceCall;
        this.f27480c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27478a) {
            case 0:
                this.f27479b.lambda$updateParticipants$11(this.f27480c, tLObject, tL_error);
                return;
            case 1:
                this.f27479b.lambda$pull_outbound$6(this.f27480c, tLObject, tL_error);
                return;
            default:
                this.f27479b.lambda$kick$13(this.f27480c, tLObject, tL_error);
                return;
        }
    }
}
