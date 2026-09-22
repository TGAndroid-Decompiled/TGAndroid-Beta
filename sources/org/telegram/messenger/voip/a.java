package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f17855a;
    public final ConferenceCall f17856b;
    public final long f17857c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f17855a = i10;
        this.f17856b = conferenceCall;
        this.f17857c = j3;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                this.f17856b.lambda$pull_outbound$5(this.f17857c, this.d, this.e);
                return;
            case 1:
                this.f17856b.lambda$kick$12(this.f17857c, this.d, this.e);
                return;
            default:
                this.f17856b.lambda$updateParticipants$10(this.f17857c, this.d, this.e);
                return;
        }
    }
}
