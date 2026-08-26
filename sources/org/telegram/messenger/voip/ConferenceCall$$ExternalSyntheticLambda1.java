package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ConferenceCall$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final ConferenceCall f$0;
    public final long f$1;

    public ConferenceCall$$ExternalSyntheticLambda1(ConferenceCall conferenceCall, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = conferenceCall;
        this.f$1 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateParticipants$11(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$pull_outbound$6(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$kick$13(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
