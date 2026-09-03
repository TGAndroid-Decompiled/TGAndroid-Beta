package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f18561a;
    public final MessagesController f18562b;
    public final long f18563c;
    public final long d;
    public final ArrayList e;

    public ub(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f18561a = i10;
        this.f18562b = messagesController;
        this.f18563c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$checkUnreadPollVotesInternal2$430(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f18562b.lambda$checkUnreadPollVotesInternal2$432(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f18562b.lambda$checkUnreadPollVotesInternal2$434(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f18562b.lambda$checkUnreadReactionsInternal2$423(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f18562b.lambda$checkUnreadReactionsInternal2$425(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f18562b.lambda$checkUnreadReactionsInternal2$427(this.f18563c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
