package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f20373a;
    public final ConferenceCall f20374b;
    public final long f20375c;
    public final TLObject d;
    public final TLRPC.TL_error f20376e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f20373a = i10;
        this.f20374b = conferenceCall;
        this.f20375c = j10;
        this.d = tLObject;
        this.f20376e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20373a) {
            case 0:
                this.f20374b.lambda$pull_outbound$5(this.f20375c, this.d, this.f20376e);
                return;
            case 1:
                this.f20374b.lambda$kick$12(this.f20375c, this.d, this.f20376e);
                return;
            default:
                this.f20374b.lambda$updateParticipants$10(this.f20375c, this.d, this.f20376e);
                return;
        }
    }
}
