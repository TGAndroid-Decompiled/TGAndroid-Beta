package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class a implements Runnable {

    public final int f21879a;

    public final ConferenceCall f21880b;

    public final long f21881c;
    public final TLObject d;

    public final TLRPC.TL_error f21882e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21879a = i10;
        this.f21880b = conferenceCall;
        this.f21881c = j10;
        this.d = tLObject;
        this.f21882e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21879a) {
            case 0:
                this.f21880b.lambda$pull_outbound$5(this.f21881c, this.d, this.f21882e);
                break;
            case 1:
                this.f21880b.lambda$kick$12(this.f21881c, this.d, this.f21882e);
                break;
            default:
                this.f21880b.lambda$updateParticipants$10(this.f21881c, this.d, this.f21882e);
                break;
        }
    }
}
