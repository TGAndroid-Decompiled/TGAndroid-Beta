package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27463a;
    public final ConferenceCall f27464b;
    public final long f27465c;
    public final TLObject d;
    public final TLRPC.TL_error f27466e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27463a = i7;
        this.f27464b = conferenceCall;
        this.f27465c = j3;
        this.d = tLObject;
        this.f27466e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27463a) {
            case 0:
                this.f27464b.lambda$pull_outbound$5(this.f27465c, this.d, this.f27466e);
                return;
            case 1:
                this.f27464b.lambda$kick$12(this.f27465c, this.d, this.f27466e);
                return;
            default:
                this.f27464b.lambda$updateParticipants$10(this.f27465c, this.d, this.f27466e);
                return;
        }
    }
}
