package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb implements RequestDelegate {
    public final int f19736a;
    public final MessagesController f19737b;
    public final long f19738c;
    public final long d;
    public final ArrayList e;

    public vb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.f19736a = i10;
        this.f19737b = messagesController;
        this.f19738c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19736a) {
            case 0:
                this.f19737b.lambda$checkUnreadPollVotesInternal2$433(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
            case 1:
                this.f19737b.lambda$checkUnreadPollVotesInternal2$435(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
            case 2:
                this.f19737b.lambda$checkUnreadPollVotesInternal2$437(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
            case 3:
                this.f19737b.lambda$checkUnreadReactionsInternal2$426(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
            case 4:
                this.f19737b.lambda$checkUnreadReactionsInternal2$428(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
            default:
                this.f19737b.lambda$checkUnreadReactionsInternal2$430(this.f19738c, this.d, this.e, tLObject, tL_error);
                return;
        }
    }
}
