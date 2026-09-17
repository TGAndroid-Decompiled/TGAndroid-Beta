package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rb implements RequestDelegate {
    public final int f18895a;
    public final MessagesController f18896b;
    public final long f18897c;
    public final long d;
    public final ArrayList f18898e;

    public rb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f18895a = i10;
        this.f18896b = messagesController;
        this.f18897c = j3;
        this.d = j10;
        this.f18898e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18895a) {
            case 0:
                this.f18896b.lambda$checkUnreadPollVotesInternal2$430(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
            case 1:
                this.f18896b.lambda$checkUnreadPollVotesInternal2$432(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
            case 2:
                this.f18896b.lambda$checkUnreadPollVotesInternal2$434(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
            case 3:
                this.f18896b.lambda$checkUnreadReactionsInternal2$423(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
            case 4:
                this.f18896b.lambda$checkUnreadReactionsInternal2$425(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
            default:
                this.f18896b.lambda$checkUnreadReactionsInternal2$427(this.f18897c, this.d, this.f18898e, tLObject, tL_error);
                return;
        }
    }
}
