package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f26101a;
    public final ConferenceCall f26102b;
    public final long f26103c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f26101a = i7;
        this.f26102b = conferenceCall;
        this.f26103c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26101a) {
            case 0:
                this.f26102b.lambda$updateParticipants$11(this.f26103c, tLObject, tL_error);
                return;
            case 1:
                this.f26102b.lambda$pull_outbound$6(this.f26103c, tLObject, tL_error);
                return;
            default:
                this.f26102b.lambda$kick$13(this.f26103c, tLObject, tL_error);
                return;
        }
    }
}
