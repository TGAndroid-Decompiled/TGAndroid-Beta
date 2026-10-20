package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xb implements RequestDelegate {
    public final int f20074a;
    public final MessagesController f20075b;
    public final long f20076c;
    public final long d;
    public final ArrayList e;

    public xb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f20074a = i10;
        this.f20075b = messagesController;
        this.f20076c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20074a) {
            case 0:
                this.f20075b.lambda$checkUnreadPollVotesInternal2$433(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f20075b.lambda$checkUnreadPollVotesInternal2$435(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f20075b.lambda$checkUnreadPollVotesInternal2$437(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f20075b.lambda$checkUnreadReactionsInternal2$426(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f20075b.lambda$checkUnreadReactionsInternal2$428(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f20075b.lambda$checkUnreadReactionsInternal2$430(this.f20076c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
