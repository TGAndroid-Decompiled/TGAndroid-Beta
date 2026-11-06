package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f26095a;
    public final ConferenceCall f26096b;
    public final long f26097c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f26095a = i7;
        this.f26096b = conferenceCall;
        this.f26097c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26095a) {
            case 0:
                this.f26096b.lambda$updateParticipants$11(this.f26097c, tLObject, tL_error);
                return;
            case 1:
                this.f26096b.lambda$pull_outbound$6(this.f26097c, tLObject, tL_error);
                return;
            default:
                this.f26096b.lambda$kick$13(this.f26097c, tLObject, tL_error);
                return;
        }
    }
}
