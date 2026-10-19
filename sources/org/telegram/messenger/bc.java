package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc implements RequestDelegate {
    public final int f17947a;
    public final MessagesController f17948b;
    public final long f17949c;
    public final long d;

    public bc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17947a = i10;
        this.f17948b = messagesController;
        this.f17949c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17947a) {
            case 0:
                this.f17948b.lambda$loadUnknownDialog$207(this.f17949c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17948b.lambda$deleteMessages$123(this.f17949c, this.d, tLObject, tL_error);
                return;
        }
    }
}
