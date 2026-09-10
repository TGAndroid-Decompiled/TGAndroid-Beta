package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f16685a;
    public final ConferenceCall f16686b;
    public final long f16687c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f16685a = i10;
        this.f16686b = conferenceCall;
        this.f16687c = j3;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f16685a) {
            case 0:
                this.f16686b.lambda$pull_outbound$5(this.f16687c, this.d, this.e);
                return;
            case 1:
                this.f16686b.lambda$kick$12(this.f16687c, this.d, this.e);
                return;
            default:
                this.f16686b.lambda$updateParticipants$10(this.f16687c, this.d, this.e);
                return;
        }
    }
}
