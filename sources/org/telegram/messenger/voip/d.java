package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class d implements RequestDelegate {

    public final int f21892a;

    public final ConferenceCall f21893b;

    public final long f21894c;

    public d(ConferenceCall conferenceCall, long j10, int i10) {
        this.f21892a = i10;
        this.f21893b = conferenceCall;
        this.f21894c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21892a) {
            case 0:
                this.f21893b.lambda$updateParticipants$11(this.f21894c, tLObject, tL_error);
                break;
            case 1:
                this.f21893b.lambda$pull_outbound$6(this.f21894c, tLObject, tL_error);
                break;
            default:
                this.f21893b.lambda$kick$13(this.f21894c, tLObject, tL_error);
                break;
        }
    }
}
