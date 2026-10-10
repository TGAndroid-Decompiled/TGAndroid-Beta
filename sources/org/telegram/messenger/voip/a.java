package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19522a;
    public final ConferenceCall f19523b;
    public final long f19524c;
    public final TLObject d;
    public final TLRPC.TL_error f19525e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19522a = i10;
        this.f19523b = conferenceCall;
        this.f19524c = j3;
        this.d = tLObject;
        this.f19525e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19522a) {
            case 0:
                this.f19523b.lambda$pull_outbound$5(this.f19524c, this.d, this.f19525e);
                return;
            case 1:
                this.f19523b.lambda$kick$12(this.f19524c, this.d, this.f19525e);
                return;
            default:
                this.f19523b.lambda$updateParticipants$10(this.f19524c, this.d, this.f19525e);
                return;
        }
    }
}
