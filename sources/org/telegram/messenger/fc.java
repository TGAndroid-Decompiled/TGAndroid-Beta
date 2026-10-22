package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f18347a;
    public final MessagesController f18348b;
    public final long f18349c;
    public final long d;

    public fc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18347a = i10;
        this.f18348b = messagesController;
        this.f18349c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18347a) {
            case 0:
                this.f18348b.lambda$loadUnknownDialog$207(this.f18349c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18348b.lambda$deleteMessages$123(this.f18349c, this.d, tLObject, tL_error);
                return;
        }
    }
}
