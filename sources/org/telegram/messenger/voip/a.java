package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f18730a;
    public final ConferenceCall f18731b;
    public final long f18732c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18730a = i10;
        this.f18731b = conferenceCall;
        this.f18732c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18730a) {
            case 0:
                this.f18731b.lambda$pull_outbound$5(this.f18732c, this.d, this.e);
                return;
            case 1:
                this.f18731b.lambda$kick$12(this.f18732c, this.d, this.e);
                return;
            default:
                this.f18731b.lambda$updateParticipants$10(this.f18732c, this.d, this.e);
                return;
        }
    }
}
