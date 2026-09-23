package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f17757a;
    public final MessagesController f17758b;
    public final long f17759c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17757a = i10;
        this.f17758b = messagesController;
        this.f17759c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17757a) {
            case 0:
                this.f17758b.lambda$loadUnknownDialog$208(this.f17759c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17758b.lambda$deleteMessages$124(this.f17759c, this.d, tLObject, tL_error);
                return;
        }
    }
}
