package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tb implements RequestDelegate {
    public final int f21637a;
    public final MessagesController f21638b;
    public final long f21639c;
    public final long d;
    public final ArrayList f21640e;

    public tb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f21637a = i10;
        this.f21638b = messagesController;
        this.f21639c = j10;
        this.d = j11;
        this.f21640e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21637a) {
            case 0:
                this.f21638b.lambda$checkUnreadPollVotesInternal2$430(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
            case 1:
                this.f21638b.lambda$checkUnreadPollVotesInternal2$432(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
            case 2:
                this.f21638b.lambda$checkUnreadPollVotesInternal2$434(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
            case 3:
                this.f21638b.lambda$checkUnreadReactionsInternal2$423(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
            case 4:
                this.f21638b.lambda$checkUnreadReactionsInternal2$425(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
            default:
                this.f21638b.lambda$checkUnreadReactionsInternal2$427(this.f21639c, this.d, this.f21640e, tLObject, tL_error);
                return;
        }
    }
}
