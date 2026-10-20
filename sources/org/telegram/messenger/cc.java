package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f18084a;
    public final MessagesController f18085b;
    public final long f18086c;
    public final long d;

    public cc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18084a = i10;
        this.f18085b = messagesController;
        this.f18086c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18084a) {
            case 0:
                this.f18085b.lambda$loadUnknownDialog$207(this.f18086c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18085b.lambda$deleteMessages$123(this.f18086c, this.d, tLObject, tL_error);
                return;
        }
    }
}
