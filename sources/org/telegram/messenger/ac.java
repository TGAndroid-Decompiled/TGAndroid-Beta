package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f16775a;
    public final MessagesController f16776b;
    public final long f16777c;
    public final long d;
    public final ArrayList e;

    public ac(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f16775a = i10;
        this.f16776b = messagesController;
        this.f16777c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16775a) {
            case 0:
                this.f16776b.lambda$checkUnreadPollVotesInternal2$433(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f16776b.lambda$checkUnreadPollVotesInternal2$435(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f16776b.lambda$checkUnreadPollVotesInternal2$437(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f16776b.lambda$checkUnreadReactionsInternal2$426(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f16776b.lambda$checkUnreadReactionsInternal2$428(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f16776b.lambda$checkUnreadReactionsInternal2$430(this.f16777c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
