package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f17561a;
    public final MessagesController f17562b;
    public final long f17563c;
    public final long d;

    public cc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17561a = i10;
        this.f17562b = messagesController;
        this.f17563c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17561a) {
            case 0:
                this.f17562b.lambda$loadUnknownDialog$207(this.f17563c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17562b.lambda$deleteMessages$123(this.f17563c, this.d, tLObject, tL_error);
                return;
        }
    }
}
