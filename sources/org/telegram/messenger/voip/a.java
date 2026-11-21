package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27491a;
    public final ConferenceCall f27492b;
    public final long f27493c;
    public final TLObject d;
    public final TLRPC.TL_error f27494e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27491a = i7;
        this.f27492b = conferenceCall;
        this.f27493c = j3;
        this.d = tLObject;
        this.f27494e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27491a) {
            case 0:
                this.f27492b.lambda$pull_outbound$5(this.f27493c, this.d, this.f27494e);
                return;
            case 1:
                this.f27492b.lambda$kick$12(this.f27493c, this.d, this.f27494e);
                return;
            default:
                this.f27492b.lambda$updateParticipants$10(this.f27493c, this.d, this.f27494e);
                return;
        }
    }
}
