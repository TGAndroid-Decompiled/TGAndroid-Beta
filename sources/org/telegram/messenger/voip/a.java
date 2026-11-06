package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f26080a;
    public final ConferenceCall f26081b;
    public final long f26082c;
    public final TLObject d;
    public final TLRPC.TL_error f26083e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f26080a = i7;
        this.f26081b = conferenceCall;
        this.f26082c = j3;
        this.d = tLObject;
        this.f26083e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26080a) {
            case 0:
                this.f26081b.lambda$pull_outbound$5(this.f26082c, this.d, this.f26083e);
                return;
            case 1:
                this.f26081b.lambda$kick$12(this.f26082c, this.d, this.f26083e);
                return;
            default:
                this.f26081b.lambda$updateParticipants$10(this.f26082c, this.d, this.f26083e);
                return;
        }
    }
}
