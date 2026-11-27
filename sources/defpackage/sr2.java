package defpackage;

import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sr2 implements RequestDelegate {
    public final byte a;
    public final ConferenceCall b;
    public final long c;

    public sr2(ConferenceCall conferenceCall, long j, byte b) {
        this.a = b;
        this.b = conferenceCall;
        this.c = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.c;
        ConferenceCall conferenceCall = this.b;
        switch (b) {
            case 0:
                conferenceCall.lambda$updateParticipants$11(j, tLObject, tL_error);
                return;
            case 1:
                conferenceCall.lambda$pull_outbound$6(j, tLObject, tL_error);
                return;
            default:
                conferenceCall.lambda$kick$13(j, tLObject, tL_error);
                return;
        }
    }
}
