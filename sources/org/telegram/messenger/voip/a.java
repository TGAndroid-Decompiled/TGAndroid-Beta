package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a implements Runnable {
    public final int f19317a;
    public final ConferenceCall f19318b;
    public final long f19319c;
    public final TLObject d;
    public final TLRPC.TL_error f19320e;

    public a(ConferenceCall conferenceCall, long j3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19317a = i10;
        this.f19318b = conferenceCall;
        this.f19319c = j3;
        this.d = tLObject;
        this.f19320e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19317a) {
            case 0:
                this.f19318b.lambda$pull_outbound$5(this.f19319c, this.d, this.f19320e);
                return;
            case 1:
                this.f19318b.lambda$kick$12(this.f19319c, this.d, this.f19320e);
                return;
            default:
                this.f19318b.lambda$updateParticipants$10(this.f19319c, this.d, this.f19320e);
                return;
        }
    }
}
