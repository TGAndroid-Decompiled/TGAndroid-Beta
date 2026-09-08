package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb implements RequestDelegate {
    public final int f19001a;
    public final MessagesController f19002b;
    public final long f19003c;
    public final long d;
    public final ArrayList f19004e;

    public sb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f19001a = i10;
        this.f19002b = messagesController;
        this.f19003c = j3;
        this.d = j10;
        this.f19004e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19001a) {
            case 0:
                this.f19002b.lambda$checkUnreadPollVotesInternal2$430(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
            case 1:
                this.f19002b.lambda$checkUnreadPollVotesInternal2$432(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
            case 2:
                this.f19002b.lambda$checkUnreadPollVotesInternal2$434(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
            case 3:
                this.f19002b.lambda$checkUnreadReactionsInternal2$423(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
            case 4:
                this.f19002b.lambda$checkUnreadReactionsInternal2$425(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
            default:
                this.f19002b.lambda$checkUnreadReactionsInternal2$427(this.f19003c, this.d, this.f19004e, tLObject, tL_error);
                return;
        }
    }
}
