package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19331a;
    public final ConferenceCall f19332b;
    public final long f19333c;
    public final TLObject d;
    public final TLRPC.TL_error f19334e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19331a = i10;
        this.f19332b = conferenceCall;
        this.f19333c = j3;
        this.d = tLObject;
        this.f19334e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19331a) {
            case 0:
                this.f19332b.lambda$pull_outbound$5(this.f19333c, this.d, this.f19334e);
                return;
            case 1:
                this.f19332b.lambda$kick$12(this.f19333c, this.d, this.f19334e);
                return;
            default:
                this.f19332b.lambda$updateParticipants$10(this.f19333c, this.d, this.f19334e);
                return;
        }
    }
}
