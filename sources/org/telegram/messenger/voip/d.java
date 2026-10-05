package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f19528a;
    public final ConferenceCall f19529b;
    public final long f19530c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f19528a = i10;
        this.f19529b = conferenceCall;
        this.f19530c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19528a) {
            case 0:
                this.f19529b.lambda$updateParticipants$11(this.f19530c, tLObject, tL_error);
                return;
            case 1:
                this.f19529b.lambda$pull_outbound$6(this.f19530c, tLObject, tL_error);
                return;
            default:
                this.f19529b.lambda$kick$13(this.f19530c, tLObject, tL_error);
                return;
        }
    }
}
