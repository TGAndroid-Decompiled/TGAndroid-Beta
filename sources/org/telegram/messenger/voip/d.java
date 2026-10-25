package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f21624a;
    public final ConferenceCall f21625b;
    public final long f21626c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f21624a = i10;
        this.f21625b = conferenceCall;
        this.f21626c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21624a) {
            case 0:
                this.f21625b.lambda$updateParticipants$11(this.f21626c, tLObject, tL_error);
                return;
            case 1:
                this.f21625b.lambda$pull_outbound$6(this.f21626c, tLObject, tL_error);
                return;
            default:
                this.f21625b.lambda$kick$13(this.f21626c, tLObject, tL_error);
                return;
        }
    }
}
