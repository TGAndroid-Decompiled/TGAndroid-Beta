package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19976a;
    public final MessagesController f19977b;
    public final long f19978c;
    public final long d;
    public final ArrayList e;

    public wb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f19976a = i10;
        this.f19977b = messagesController;
        this.f19978c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19976a) {
            case 0:
                this.f19977b.lambda$checkUnreadPollVotesInternal2$433(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f19977b.lambda$checkUnreadPollVotesInternal2$435(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f19977b.lambda$checkUnreadPollVotesInternal2$437(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f19977b.lambda$checkUnreadReactionsInternal2$426(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f19977b.lambda$checkUnreadReactionsInternal2$428(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f19977b.lambda$checkUnreadReactionsInternal2$430(this.f19978c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
