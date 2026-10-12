package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19297a;
    public final ConferenceCall f19298b;
    public final long f19299c;
    public final TLObject d;
    public final TLRPC.TL_error f19300e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19297a = i10;
        this.f19298b = conferenceCall;
        this.f19299c = j3;
        this.d = tLObject;
        this.f19300e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19297a) {
            case 0:
                this.f19298b.lambda$pull_outbound$5(this.f19299c, this.d, this.f19300e);
                return;
            case 1:
                this.f19298b.lambda$kick$12(this.f19299c, this.d, this.f19300e);
                return;
            default:
                this.f19298b.lambda$updateParticipants$10(this.f19299c, this.d, this.f19300e);
                return;
        }
    }
}
