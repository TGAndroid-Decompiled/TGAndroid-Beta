package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19517a;
    public final ConferenceCall f19518b;
    public final long f19519c;
    public final TLObject d;
    public final TLRPC.TL_error f19520e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19517a = i10;
        this.f19518b = conferenceCall;
        this.f19519c = j3;
        this.d = tLObject;
        this.f19520e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19517a) {
            case 0:
                this.f19518b.lambda$pull_outbound$5(this.f19519c, this.d, this.f19520e);
                return;
            case 1:
                this.f19518b.lambda$kick$12(this.f19519c, this.d, this.f19520e);
                return;
            default:
                this.f19518b.lambda$updateParticipants$10(this.f19519c, this.d, this.f19520e);
                return;
        }
    }
}
