package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ConferenceCall$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ConferenceCall f$0;
    public final long f$1;
    public final TLObject f$2;
    public final TLRPC.TL_error f$3;

    public ConferenceCall$$ExternalSyntheticLambda0(ConferenceCall conferenceCall, long j, TLObject tLObject, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = conferenceCall;
        this.f$1 = j;
        this.f$2 = tLObject;
        this.f$3 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$pull_outbound$5(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$kick$12(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$updateParticipants$10(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
