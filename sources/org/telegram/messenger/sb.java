package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb implements RequestDelegate {
    public final int f19148a;
    public final MessagesController f19149b;
    public final long f19150c;
    public final long d;
    public final ArrayList f19151e;

    public sb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f19148a = i10;
        this.f19149b = messagesController;
        this.f19150c = j3;
        this.d = j10;
        this.f19151e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19148a) {
            case 0:
                this.f19149b.lambda$checkUnreadPollVotesInternal2$430(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
            case 1:
                this.f19149b.lambda$checkUnreadPollVotesInternal2$432(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
            case 2:
                this.f19149b.lambda$checkUnreadPollVotesInternal2$434(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
            case 3:
                this.f19149b.lambda$checkUnreadReactionsInternal2$423(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
            case 4:
                this.f19149b.lambda$checkUnreadReactionsInternal2$425(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
            default:
                this.f19149b.lambda$checkUnreadReactionsInternal2$427(this.f19150c, this.d, this.f19151e, tLObject, tL_error);
                return;
        }
    }
}
