package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rb implements RequestDelegate {
    public final int f18922a;
    public final MessagesController f18923b;
    public final long f18924c;
    public final long d;
    public final ArrayList f18925e;

    public rb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f18922a = i10;
        this.f18923b = messagesController;
        this.f18924c = j3;
        this.d = j10;
        this.f18925e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18922a) {
            case 0:
                this.f18923b.lambda$checkUnreadPollVotesInternal2$430(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
            case 1:
                this.f18923b.lambda$checkUnreadPollVotesInternal2$432(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
            case 2:
                this.f18923b.lambda$checkUnreadPollVotesInternal2$434(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
            case 3:
                this.f18923b.lambda$checkUnreadReactionsInternal2$423(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
            case 4:
                this.f18923b.lambda$checkUnreadReactionsInternal2$425(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
            default:
                this.f18923b.lambda$checkUnreadReactionsInternal2$427(this.f18924c, this.d, this.f18925e, tLObject, tL_error);
                return;
        }
    }
}
