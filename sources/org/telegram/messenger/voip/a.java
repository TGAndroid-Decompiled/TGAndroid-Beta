package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19842a;
    public final ConferenceCall f19843b;
    public final long f19844c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19842a = i10;
        this.f19843b = conferenceCall;
        this.f19844c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19842a) {
            case 0:
                this.f19843b.lambda$pull_outbound$5(this.f19844c, this.d, this.e);
                return;
            case 1:
                this.f19843b.lambda$kick$12(this.f19844c, this.d, this.e);
                return;
            default:
                this.f19843b.lambda$updateParticipants$10(this.f19844c, this.d, this.e);
                return;
        }
    }
}
