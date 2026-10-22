package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f17861a;
    public final MessagesController f17862b;
    public final long f17863c;
    public final long d;
    public final ArrayList e;

    public ac(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f17861a = i10;
        this.f17862b = messagesController;
        this.f17863c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17861a) {
            case 0:
                this.f17862b.lambda$checkUnreadPollVotesInternal2$433(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f17862b.lambda$checkUnreadPollVotesInternal2$435(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f17862b.lambda$checkUnreadPollVotesInternal2$437(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f17862b.lambda$checkUnreadReactionsInternal2$426(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f17862b.lambda$checkUnreadReactionsInternal2$428(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f17862b.lambda$checkUnreadReactionsInternal2$430(this.f17863c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
