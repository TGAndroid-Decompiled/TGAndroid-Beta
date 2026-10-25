package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f19818a;
    public final MessagesController f19819b;
    public final long f19820c;
    public final long d;
    public final ArrayList e;

    public cc(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f19818a = i10;
        this.f19819b = messagesController;
        this.f19820c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19818a) {
            case 0:
                this.f19819b.lambda$checkUnreadPollVotesInternal2$435(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f19819b.lambda$checkUnreadPollVotesInternal2$437(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f19819b.lambda$checkUnreadPollVotesInternal2$439(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f19819b.lambda$checkUnreadReactionsInternal2$428(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f19819b.lambda$checkUnreadReactionsInternal2$430(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f19819b.lambda$checkUnreadReactionsInternal2$432(this.f19820c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
