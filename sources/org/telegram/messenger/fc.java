package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f17601a;
    public final MessagesController f17602b;
    public final long f17603c;
    public final long d;

    public fc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17601a = i10;
        this.f17602b = messagesController;
        this.f17603c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17601a) {
            case 0:
                this.f17602b.lambda$loadUnknownDialog$207(this.f17603c, this.d, tLObject, tL_error);
                return;
            default:
                this.f17602b.lambda$deleteMessages$123(this.f17603c, this.d, tLObject, tL_error);
                return;
        }
    }
}
