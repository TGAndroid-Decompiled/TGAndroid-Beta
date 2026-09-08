package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19360a;
    public final ConferenceCall f19361b;
    public final long f19362c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19360a = i10;
        this.f19361b = conferenceCall;
        this.f19362c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$updateParticipants$11(this.f19362c, tLObject, tL_error);
                return;
            case 1:
                this.f19361b.lambda$pull_outbound$6(this.f19362c, tLObject, tL_error);
                return;
            default:
                this.f19361b.lambda$kick$13(this.f19362c, tLObject, tL_error);
                return;
        }
    }
}
