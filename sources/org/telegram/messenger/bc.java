package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc implements RequestDelegate {
    public final int f17944a;
    public final MessagesController f17945b;
    public final long f17946c;
    public final long d;

    public bc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17944a = i10;
        this.f17945b = messagesController;
        this.f17946c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17944a) {
            case 0:
                this.f17945b.lambda$loadUnknownDialog$207(this.f17946c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17945b.lambda$deleteMessages$123(this.f17946c, this.d, tLObject, tL_error);
                return;
        }
    }
}
