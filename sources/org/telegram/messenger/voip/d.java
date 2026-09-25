package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f17873a;
    public final ConferenceCall f17874b;
    public final long f17875c;

    public d(ConferenceCall conferenceCall, long j3, int i10) {
        this.f17873a = i10;
        this.f17874b = conferenceCall;
        this.f17875c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17873a) {
            case 0:
                this.f17874b.lambda$updateParticipants$11(this.f17875c, tLObject, tL_error);
                return;
            case 1:
                this.f17874b.lambda$pull_outbound$6(this.f17875c, tLObject, tL_error);
                return;
            default:
                this.f17874b.lambda$kick$13(this.f17875c, tLObject, tL_error);
                return;
        }
    }
}
