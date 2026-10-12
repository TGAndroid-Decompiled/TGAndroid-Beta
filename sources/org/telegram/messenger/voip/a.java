package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19296a;
    public final ConferenceCall f19297b;
    public final long f19298c;
    public final TLObject d;
    public final TLRPC.TL_error f19299e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19296a = i10;
        this.f19297b = conferenceCall;
        this.f19298c = j3;
        this.d = tLObject;
        this.f19299e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19296a) {
            case 0:
                this.f19297b.lambda$pull_outbound$5(this.f19298c, this.d, this.f19299e);
                return;
            case 1:
                this.f19297b.lambda$kick$12(this.f19298c, this.d, this.f19299e);
                return;
            default:
                this.f19297b.lambda$updateParticipants$10(this.f19298c, this.d, this.f19299e);
                return;
        }
    }
}
