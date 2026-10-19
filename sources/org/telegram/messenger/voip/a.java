package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19827a;
    public final ConferenceCall f19828b;
    public final long f19829c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19827a = i10;
        this.f19828b = conferenceCall;
        this.f19829c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                this.f19828b.lambda$pull_outbound$5(this.f19829c, this.d, this.e);
                return;
            case 1:
                this.f19828b.lambda$kick$12(this.f19829c, this.d, this.e);
                return;
            default:
                this.f19828b.lambda$updateParticipants$10(this.f19829c, this.d, this.e);
                return;
        }
    }
}
