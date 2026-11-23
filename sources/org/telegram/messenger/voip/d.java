package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f27431a;
    public final ConferenceCall f27432b;
    public final long f27433c;

    public d(ConferenceCall conferenceCall, long j3, int i7) {
        this.f27431a = i7;
        this.f27432b = conferenceCall;
        this.f27433c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27431a) {
            case 0:
                this.f27432b.lambda$updateParticipants$11(this.f27433c, tLObject, tL_error);
                return;
            case 1:
                this.f27432b.lambda$pull_outbound$6(this.f27433c, tLObject, tL_error);
                return;
            default:
                this.f27432b.lambda$kick$13(this.f27433c, tLObject, tL_error);
                return;
        }
    }
}
