package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f17864a;
    public final MessagesController f17865b;
    public final long f17866c;
    public final long d;

    public ac(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17864a = i10;
        this.f17865b = messagesController;
        this.f17866c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17864a) {
            case 0:
                this.f17865b.lambda$loadUnknownDialog$207(this.f17866c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17865b.lambda$deleteMessages$123(this.f17866c, this.d, tLObject, tL_error);
                return;
        }
    }
}
