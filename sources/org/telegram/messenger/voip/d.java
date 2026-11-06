package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f26087a;
    public final ConferenceCall f26088b;
    public final long f26089c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f26087a = i7;
        this.f26088b = conferenceCall;
        this.f26089c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26087a) {
            case 0:
                this.f26088b.lambda$updateParticipants$11(this.f26089c, tLObject, tL_error);
                return;
            case 1:
                this.f26088b.lambda$pull_outbound$6(this.f26089c, tLObject, tL_error);
                return;
            default:
                this.f26088b.lambda$kick$13(this.f26089c, tLObject, tL_error);
                return;
        }
    }
}
