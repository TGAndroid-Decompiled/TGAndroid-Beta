package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d implements RequestDelegate {
    public final int f25986a;
    public final ConferenceCall f25987b;
    public final long f25988c;

    public d(ConferenceCall conferenceCall, long j10, int i3) {
        this.f25986a = i3;
        this.f25987b = conferenceCall;
        this.f25988c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25986a) {
            case 0:
                this.f25987b.lambda$updateParticipants$11(this.f25988c, tLObject, tL_error);
                return;
            case 1:
                this.f25987b.lambda$pull_outbound$6(this.f25988c, tLObject, tL_error);
                return;
            default:
                this.f25987b.lambda$kick$13(this.f25988c, tLObject, tL_error);
                return;
        }
    }
}
