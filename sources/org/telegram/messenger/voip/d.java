package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19533a;
    public final ConferenceCall f19534b;
    public final long f19535c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19533a = i10;
        this.f19534b = conferenceCall;
        this.f19535c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19533a) {
            case 0:
                this.f19534b.lambda$updateParticipants$11(this.f19535c, tLObject, tL_error);
                return;
            case 1:
                this.f19534b.lambda$pull_outbound$6(this.f19535c, tLObject, tL_error);
                return;
            default:
                this.f19534b.lambda$kick$13(this.f19535c, tLObject, tL_error);
                return;
        }
    }
}
