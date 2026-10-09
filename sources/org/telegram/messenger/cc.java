package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f17559a;
    public final MessagesController f17560b;
    public final long f17561c;
    public final long d;

    public cc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17559a = i10;
        this.f17560b = messagesController;
        this.f17561c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17559a) {
            case 0:
                this.f17560b.lambda$loadUnknownDialog$207(this.f17561c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17560b.lambda$deleteMessages$123(this.f17561c, this.d, tLObject, tL_error);
                return;
        }
    }
}
