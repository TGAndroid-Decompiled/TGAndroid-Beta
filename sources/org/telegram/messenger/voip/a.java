package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f21855a;
    public final ConferenceCall f21856b;
    public final long f21857c;
    public final TLObject d;
    public final TLRPC.TL_error f21858e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i9) {
        this.f21855a = i9;
        this.f21856b = conferenceCall;
        this.f21857c = j10;
        this.d = tLObject;
        this.f21858e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21855a) {
            case 0:
                this.f21856b.lambda$pull_outbound$5(this.f21857c, this.d, this.f21858e);
                return;
            case 1:
                this.f21856b.lambda$kick$12(this.f21857c, this.d, this.f21858e);
                return;
            default:
                this.f21856b.lambda$updateParticipants$10(this.f21857c, this.d, this.f21858e);
                return;
        }
    }
}
