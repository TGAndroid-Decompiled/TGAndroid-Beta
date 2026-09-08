package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19344a;
    public final ConferenceCall f19345b;
    public final long f19346c;
    public final TLObject d;
    public final TLRPC.TL_error f19347e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19344a = i10;
        this.f19345b = conferenceCall;
        this.f19346c = j3;
        this.d = tLObject;
        this.f19347e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19344a) {
            case 0:
                this.f19345b.lambda$pull_outbound$5(this.f19346c, this.d, this.f19347e);
                return;
            case 1:
                this.f19345b.lambda$kick$12(this.f19346c, this.d, this.f19347e);
                return;
            default:
                this.f19345b.lambda$updateParticipants$10(this.f19346c, this.d, this.f19347e);
                return;
        }
    }
}
