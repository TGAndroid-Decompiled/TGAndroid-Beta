package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f17074a;
    public final MessagesController f17075b;
    public final long f17076c;
    public final long d;
    public final ArrayList f17077e;

    public ac(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f17074a = i10;
        this.f17075b = messagesController;
        this.f17076c = j3;
        this.d = j10;
        this.f17077e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17074a) {
            case 0:
                this.f17075b.lambda$checkUnreadPollVotesInternal2$433(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
            case 1:
                this.f17075b.lambda$checkUnreadPollVotesInternal2$435(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
            case 2:
                this.f17075b.lambda$checkUnreadPollVotesInternal2$437(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
            case 3:
                this.f17075b.lambda$checkUnreadReactionsInternal2$426(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
            case 4:
                this.f17075b.lambda$checkUnreadReactionsInternal2$428(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
            default:
                this.f17075b.lambda$checkUnreadReactionsInternal2$430(this.f17076c, this.d, this.f17077e, tLObject, tL_error);
                return;
        }
    }
}
