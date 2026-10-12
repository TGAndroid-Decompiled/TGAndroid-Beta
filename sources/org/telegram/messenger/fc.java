package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f17241a;
    public final MessagesController f17242b;
    public final long f17243c;
    public final long d;

    public fc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17241a = i10;
        this.f17242b = messagesController;
        this.f17243c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17241a) {
            case 0:
                this.f17242b.lambda$loadUnknownDialog$207(this.f17243c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17242b.lambda$deleteMessages$123(this.f17243c, this.d, tLObject, tL_error);
                return;
        }
    }
}
