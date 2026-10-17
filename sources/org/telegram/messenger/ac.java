package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ac implements RequestDelegate {
    public final int f17855a;
    public final MessagesController f17856b;
    public final long f17857c;
    public final long d;

    public ac(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17855a = i10;
        this.f17856b = messagesController;
        this.f17857c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17855a) {
            case 0:
                this.f17856b.lambda$loadUnknownDialog$207(this.f17857c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17856b.lambda$deleteMessages$123(this.f17857c, this.d, tLObject, tL_error);
                return;
        }
    }
}
