package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19845a;
    public final ConferenceCall f19846b;
    public final long f19847c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j10, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19845a = i10;
        this.f19846b = conferenceCall;
        this.f19847c = j10;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19845a) {
            case 0:
                this.f19846b.lambda$pull_outbound$5(this.f19847c, this.d, this.e);
                return;
            case 1:
                this.f19846b.lambda$kick$12(this.f19847c, this.d, this.e);
                return;
            default:
                this.f19846b.lambda$updateParticipants$10(this.f19847c, this.d, this.e);
                return;
        }
    }
}
