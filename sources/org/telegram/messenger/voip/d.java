package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19859a;
    public final ConferenceCall f19860b;
    public final long f19861c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f19859a = i10;
        this.f19860b = conferenceCall;
        this.f19861c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19859a) {
            case 0:
                this.f19860b.lambda$updateParticipants$11(this.f19861c, tLObject, tL_error);
                return;
            case 1:
                this.f19860b.lambda$pull_outbound$6(this.f19861c, tLObject, tL_error);
                return;
            default:
                this.f19860b.lambda$kick$13(this.f19861c, tLObject, tL_error);
                return;
        }
    }
}
