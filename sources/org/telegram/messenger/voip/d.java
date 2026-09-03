package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f20391a;
    public final ConferenceCall f20392b;
    public final long f20393c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f20391a = i10;
        this.f20392b = conferenceCall;
        this.f20393c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20391a) {
            case 0:
                this.f20392b.lambda$updateParticipants$11(this.f20393c, tLObject, tL_error);
                return;
            case 1:
                this.f20392b.lambda$pull_outbound$6(this.f20393c, tLObject, tL_error);
                return;
            default:
                this.f20392b.lambda$kick$13(this.f20393c, tLObject, tL_error);
                return;
        }
    }
}
