package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc implements RequestDelegate {
    public final int f19699a;
    public final MessagesController f19700b;
    public final long f19701c;
    public final long d;
    public final ArrayList e;

    public bc(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f19699a = i10;
        this.f19700b = messagesController;
        this.f19701c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19699a) {
            case 0:
                this.f19700b.lambda$checkUnreadPollVotesInternal2$436(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f19700b.lambda$checkUnreadPollVotesInternal2$438(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f19700b.lambda$checkUnreadPollVotesInternal2$440(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f19700b.lambda$checkUnreadReactionsInternal2$429(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f19700b.lambda$checkUnreadReactionsInternal2$431(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f19700b.lambda$checkUnreadReactionsInternal2$433(this.f19701c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
