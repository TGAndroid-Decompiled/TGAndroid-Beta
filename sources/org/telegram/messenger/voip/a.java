package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27454a;
    public final ConferenceCall f27455b;
    public final long f27456c;
    public final TLObject d;
    public final TLRPC.TL_error f27457e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27454a = i7;
        this.f27455b = conferenceCall;
        this.f27456c = j3;
        this.d = tLObject;
        this.f27457e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27454a) {
            case 0:
                this.f27455b.lambda$pull_outbound$5(this.f27456c, this.d, this.f27457e);
                return;
            case 1:
                this.f27455b.lambda$kick$12(this.f27456c, this.d, this.f27457e);
                return;
            default:
                this.f27455b.lambda$updateParticipants$10(this.f27456c, this.d, this.f27457e);
                return;
        }
    }
}
