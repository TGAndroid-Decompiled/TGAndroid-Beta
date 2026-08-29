package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f21919a;
    public final ConferenceCall f21920b;
    public final long f21921c;
    public final TLObject d;
    public final TLRPC.TL_error f21922e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21919a = i10;
        this.f21920b = conferenceCall;
        this.f21921c = j10;
        this.d = tLObject;
        this.f21922e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21919a) {
            case 0:
                this.f21920b.lambda$pull_outbound$5(this.f21921c, this.d, this.f21922e);
                return;
            case 1:
                this.f21920b.lambda$kick$12(this.f21921c, this.d, this.f21922e);
                return;
            default:
                this.f21920b.lambda$updateParticipants$10(this.f21921c, this.d, this.f21922e);
                return;
        }
    }
}
