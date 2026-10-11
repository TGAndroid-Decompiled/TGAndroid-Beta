package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19556a;
    public final ConferenceCall f19557b;
    public final long f19558c;
    public final TLObject d;
    public final TLRPC.TL_error f19559e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19556a = i10;
        this.f19557b = conferenceCall;
        this.f19558c = j3;
        this.d = tLObject;
        this.f19559e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19556a) {
            case 0:
                this.f19557b.lambda$pull_outbound$5(this.f19558c, this.d, this.f19559e);
                return;
            case 1:
                this.f19557b.lambda$kick$12(this.f19558c, this.d, this.f19559e);
                return;
            default:
                this.f19557b.lambda$updateParticipants$10(this.f19558c, this.d, this.f19559e);
                return;
        }
    }
}
