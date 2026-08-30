package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e implements RequestDelegate {
    public final int f18768a;
    public final ConferenceCall f18769b;
    public final long f18770c;

    public e(ConferenceCall conferenceCall, long j10, int i10) {
        this.f18768a = i10;
        this.f18769b = conferenceCall;
        this.f18770c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18768a) {
            case 0:
                this.f18769b.lambda$updateParticipants$11(this.f18770c, tLObject, tL_error);
                return;
            case 1:
                this.f18769b.lambda$pull_outbound$6(this.f18770c, tLObject, tL_error);
                return;
            default:
                this.f18769b.lambda$kick$13(this.f18770c, tLObject, tL_error);
                return;
        }
    }
}
