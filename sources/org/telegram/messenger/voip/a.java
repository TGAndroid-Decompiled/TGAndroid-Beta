package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f25971a;
    public final ConferenceCall f25972b;
    public final long f25973c;
    public final TLObject d;
    public final TLRPC.TL_error f25974e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i3) {
        this.f25971a = i3;
        this.f25972b = conferenceCall;
        this.f25973c = j10;
        this.d = tLObject;
        this.f25974e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f25971a) {
            case 0:
                this.f25972b.lambda$pull_outbound$5(this.f25973c, this.d, this.f25974e);
                return;
            case 1:
                this.f25972b.lambda$kick$12(this.f25973c, this.d, this.f25974e);
                return;
            default:
                this.f25972b.lambda$updateParticipants$10(this.f25973c, this.d, this.f25974e);
                return;
        }
    }
}
