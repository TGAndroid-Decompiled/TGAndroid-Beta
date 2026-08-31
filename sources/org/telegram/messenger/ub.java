package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f20186a;
    public final MessagesController f20187b;
    public final long f20188c;
    public final long d;
    public final ArrayList f20189e;

    public ub(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f20186a = i10;
        this.f20187b = messagesController;
        this.f20188c = j10;
        this.d = j11;
        this.f20189e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20186a) {
            case 0:
                this.f20187b.lambda$checkUnreadPollVotesInternal2$430(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
            case 1:
                this.f20187b.lambda$checkUnreadPollVotesInternal2$432(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
            case 2:
                this.f20187b.lambda$checkUnreadPollVotesInternal2$434(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
            case 3:
                this.f20187b.lambda$checkUnreadReactionsInternal2$423(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
            case 4:
                this.f20187b.lambda$checkUnreadReactionsInternal2$425(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
            default:
                this.f20187b.lambda$checkUnreadReactionsInternal2$427(this.f20188c, this.d, this.f20189e, tLObject, tL_error);
                return;
        }
    }
}
