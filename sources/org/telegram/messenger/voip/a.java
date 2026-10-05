package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19515a;
    public final ConferenceCall f19516b;
    public final long f19517c;
    public final TLObject d;
    public final TLRPC.TL_error f19518e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19515a = i10;
        this.f19516b = conferenceCall;
        this.f19517c = j3;
        this.d = tLObject;
        this.f19518e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19515a) {
            case 0:
                this.f19516b.lambda$pull_outbound$5(this.f19517c, this.d, this.f19518e);
                return;
            case 1:
                this.f19516b.lambda$kick$12(this.f19517c, this.d, this.f19518e);
                return;
            default:
                this.f19516b.lambda$updateParticipants$10(this.f19517c, this.d, this.f19518e);
                return;
        }
    }
}
