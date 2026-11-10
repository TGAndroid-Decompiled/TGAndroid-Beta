package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f26090a;
    public final ConferenceCall f26091b;
    public final long f26092c;
    public final TLObject d;
    public final TLRPC.TL_error f26093e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f26090a = i7;
        this.f26091b = conferenceCall;
        this.f26092c = j3;
        this.d = tLObject;
        this.f26093e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f26090a) {
            case 0:
                this.f26091b.lambda$pull_outbound$5(this.f26092c, this.d, this.f26093e);
                return;
            case 1:
                this.f26091b.lambda$kick$12(this.f26092c, this.d, this.f26093e);
                return;
            default:
                this.f26091b.lambda$updateParticipants$10(this.f26092c, this.d, this.f26093e);
                return;
        }
    }
}
