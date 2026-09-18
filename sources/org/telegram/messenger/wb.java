package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f17780a;
    public final MessagesController f17781b;
    public final long f17782c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17780a = i10;
        this.f17781b = messagesController;
        this.f17782c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17780a) {
            case 0:
                this.f17781b.lambda$loadUnknownDialog$208(this.f17782c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17781b.lambda$deleteMessages$124(this.f17782c, this.d, tLObject, tL_error);
                return;
        }
    }
}
