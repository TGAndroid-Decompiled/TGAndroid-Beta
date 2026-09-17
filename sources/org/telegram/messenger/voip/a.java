package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19358a;
    public final ConferenceCall f19359b;
    public final long f19360c;
    public final TLObject d;
    public final TLRPC.TL_error f19361e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19358a = i10;
        this.f19359b = conferenceCall;
        this.f19360c = j3;
        this.d = tLObject;
        this.f19361e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19358a) {
            case 0:
                this.f19359b.lambda$pull_outbound$5(this.f19360c, this.d, this.f19361e);
                return;
            case 1:
                this.f19359b.lambda$kick$12(this.f19360c, this.d, this.f19361e);
                return;
            default:
                this.f19359b.lambda$updateParticipants$10(this.f19360c, this.d, this.f19361e);
                return;
        }
    }
}
