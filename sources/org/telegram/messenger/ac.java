package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f17075a;
    public final MessagesController f17076b;
    public final long f17077c;
    public final long d;
    public final ArrayList f17078e;

    public ac(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f17075a = i10;
        this.f17076b = messagesController;
        this.f17077c = j3;
        this.d = j10;
        this.f17078e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17075a) {
            case 0:
                this.f17076b.lambda$checkUnreadPollVotesInternal2$433(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
            case 1:
                this.f17076b.lambda$checkUnreadPollVotesInternal2$435(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
            case 2:
                this.f17076b.lambda$checkUnreadPollVotesInternal2$437(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
            case 3:
                this.f17076b.lambda$checkUnreadReactionsInternal2$426(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
            case 4:
                this.f17076b.lambda$checkUnreadReactionsInternal2$428(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
            default:
                this.f17076b.lambda$checkUnreadReactionsInternal2$430(this.f17077c, this.d, this.f17078e, tLObject, tL_error);
                return;
        }
    }
}
