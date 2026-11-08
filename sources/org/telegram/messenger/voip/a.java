package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f26086a;
    public final ConferenceCall f26087b;
    public final long f26088c;
    public final TLObject d;
    public final TLRPC.TL_error f26089e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f26086a = i7;
        this.f26087b = conferenceCall;
        this.f26088c = j3;
        this.d = tLObject;
        this.f26089e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26086a) {
            case 0:
                this.f26087b.lambda$pull_outbound$5(this.f26088c, this.d, this.f26089e);
                return;
            case 1:
                this.f26087b.lambda$kick$12(this.f26088c, this.d, this.f26089e);
                return;
            default:
                this.f26087b.lambda$updateParticipants$10(this.f26088c, this.d, this.f26089e);
                return;
        }
    }
}
