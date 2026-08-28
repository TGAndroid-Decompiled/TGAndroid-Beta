package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f21868a;
    public final ConferenceCall f21869b;
    public final long f21870c;

    public d(ConferenceCall conferenceCall, long j10, int i9) {
        this.f21868a = i9;
        this.f21869b = conferenceCall;
        this.f21870c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21868a) {
            case 0:
                this.f21869b.lambda$updateParticipants$11(this.f21870c, tLObject, tL_error);
                return;
            case 1:
                this.f21869b.lambda$pull_outbound$6(this.f21870c, tLObject, tL_error);
                return;
            default:
                this.f21869b.lambda$kick$13(this.f21870c, tLObject, tL_error);
                return;
        }
    }
}
