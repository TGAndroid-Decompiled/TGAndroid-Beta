package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f27465a;
    public final ConferenceCall f27466b;
    public final long f27467c;
    public final TLObject d;
    public final TLRPC.TL_error f27468e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.f27465a = i7;
        this.f27466b = conferenceCall;
        this.f27467c = j3;
        this.d = tLObject;
        this.f27468e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f27465a) {
            case 0:
                this.f27466b.lambda$pull_outbound$5(this.f27467c, this.d, this.f27468e);
                return;
            case 1:
                this.f27466b.lambda$kick$12(this.f27467c, this.d, this.f27468e);
                return;
            default:
                this.f27466b.lambda$updateParticipants$10(this.f27467c, this.d, this.f27468e);
                return;
        }
    }
}
