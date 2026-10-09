package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19518a;
    public final ConferenceCall f19519b;
    public final long f19520c;
    public final TLObject d;
    public final TLRPC.TL_error f19521e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19518a = i10;
        this.f19519b = conferenceCall;
        this.f19520c = j3;
        this.d = tLObject;
        this.f19521e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19518a) {
            case 0:
                this.f19519b.lambda$pull_outbound$5(this.f19520c, this.d, this.f19521e);
                return;
            case 1:
                this.f19519b.lambda$kick$12(this.f19520c, this.d, this.f19521e);
                return;
            default:
                this.f19519b.lambda$updateParticipants$10(this.f19520c, this.d, this.f19521e);
                return;
        }
    }
}
