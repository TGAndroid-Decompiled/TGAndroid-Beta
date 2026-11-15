package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27096a;
    public final ConferenceCall f27097b;
    public final long f27098c;
    public final TLObject d;
    public final TLRPC.TL_error f27099e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27096a = i7;
        this.f27097b = conferenceCall;
        this.f27098c = j3;
        this.d = tLObject;
        this.f27099e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27096a) {
            case 0:
                this.f27097b.lambda$pull_outbound$5(this.f27098c, this.d, this.f27099e);
                return;
            case 1:
                this.f27097b.lambda$kick$12(this.f27098c, this.d, this.f27099e);
                return;
            default:
                this.f27097b.lambda$updateParticipants$10(this.f27098c, this.d, this.f27099e);
                return;
        }
    }
}
