package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f17625a;
    public final ConferenceCall f17626b;
    public final long f17627c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f17625a = i10;
        this.f17626b = conferenceCall;
        this.f17627c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17625a) {
            case 0:
                this.f17626b.lambda$updateParticipants$11(this.f17627c, tLObject, tL_error);
                return;
            case 1:
                this.f17626b.lambda$pull_outbound$6(this.f17627c, tLObject, tL_error);
                return;
            default:
                this.f17626b.lambda$kick$13(this.f17627c, tLObject, tL_error);
                return;
        }
    }
}
