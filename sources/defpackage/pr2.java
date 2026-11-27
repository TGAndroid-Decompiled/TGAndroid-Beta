package defpackage;

import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr2 implements Runnable {
    public final byte a;
    public final ConferenceCall b;
    public final long c;
    public final TLObject d;
    public final TLRPC.TL_error e;

    public pr2(ConferenceCall conferenceCall, long j, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = conferenceCall;
        this.c = j;
        this.d = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.d;
        long j = this.c;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$pull_outbound$5(j, tLObject, tL_error);
                return;
            case 1:
                conferenceCall.lambda$kick$12(j, tLObject, tL_error);
                return;
            default:
                conferenceCall.lambda$updateParticipants$10(j, tLObject, tL_error);
                return;
        }
    }
}
