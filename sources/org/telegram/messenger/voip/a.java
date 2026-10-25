package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f21610a;
    public final ConferenceCall f21611b;
    public final long f21612c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21610a = i10;
        this.f21611b = conferenceCall;
        this.f21612c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21610a) {
            case 0:
                this.f21611b.lambda$pull_outbound$5(this.f21612c, this.d, this.e);
                return;
            case 1:
                this.f21611b.lambda$kick$12(this.f21612c, this.d, this.e);
                return;
            default:
                this.f21611b.lambda$updateParticipants$10(this.f21612c, this.d, this.e);
                return;
        }
    }
}
