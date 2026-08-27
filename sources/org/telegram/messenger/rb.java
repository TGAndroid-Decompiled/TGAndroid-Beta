package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class rb implements RequestDelegate {

    public final int f21427a;

    public final MessagesController f21428b;

    public final long f21429c;
    public final long d;

    public final ArrayList f21430e;

    public rb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f21427a = i10;
        this.f21428b = messagesController;
        this.f21429c = j10;
        this.d = j11;
        this.f21430e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21427a) {
            case 0:
                this.f21428b.lambda$checkUnreadPollVotesInternal2$430(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
            case 1:
                this.f21428b.lambda$checkUnreadPollVotesInternal2$432(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
            case 2:
                this.f21428b.lambda$checkUnreadPollVotesInternal2$434(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
            case 3:
                this.f21428b.lambda$checkUnreadReactionsInternal2$423(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
            case 4:
                this.f21428b.lambda$checkUnreadReactionsInternal2$425(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
            default:
                this.f21428b.lambda$checkUnreadReactionsInternal2$427(this.f21429c, this.d, this.f21430e, tLObject, tL_error);
                break;
        }
    }
}
