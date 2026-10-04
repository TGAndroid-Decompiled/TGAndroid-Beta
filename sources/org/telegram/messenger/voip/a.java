package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19510a;
    public final ConferenceCall f19511b;
    public final long f19512c;
    public final TLObject d;
    public final TLRPC.TL_error f19513e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19510a = i10;
        this.f19511b = conferenceCall;
        this.f19512c = j3;
        this.d = tLObject;
        this.f19513e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19510a) {
            case 0:
                this.f19511b.lambda$pull_outbound$5(this.f19512c, this.d, this.f19513e);
                return;
            case 1:
                this.f19511b.lambda$kick$12(this.f19512c, this.d, this.f19513e);
                return;
            default:
                this.f19511b.lambda$updateParticipants$10(this.f19512c, this.d, this.f19513e);
                return;
        }
    }
}
