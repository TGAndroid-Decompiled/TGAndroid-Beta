package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nb implements RequestDelegate {
    public final int f21046a;
    public final MessagesController f21047b;
    public final long f21048c;
    public final long d;
    public final ArrayList f21049e;

    public nb(int i9, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f21046a = i9;
        this.f21047b = messagesController;
        this.f21048c = j10;
        this.d = j11;
        this.f21049e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21046a) {
            case 0:
                this.f21047b.lambda$checkUnreadPollVotesInternal2$430(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
            case 1:
                this.f21047b.lambda$checkUnreadPollVotesInternal2$432(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
            case 2:
                this.f21047b.lambda$checkUnreadPollVotesInternal2$434(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
            case 3:
                this.f21047b.lambda$checkUnreadReactionsInternal2$423(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
            case 4:
                this.f21047b.lambda$checkUnreadReactionsInternal2$425(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
            default:
                this.f21047b.lambda$checkUnreadReactionsInternal2$427(this.f21048c, this.d, this.f21049e, tLObject, tL_error);
                return;
        }
    }
}
