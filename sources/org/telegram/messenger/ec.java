package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ec implements RequestDelegate {
    public final int f18344a;
    public final MessagesController f18345b;
    public final long f18346c;
    public final long d;

    public ec(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18344a = i10;
        this.f18345b = messagesController;
        this.f18346c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18344a) {
            case 0:
                this.f18345b.lambda$loadUnknownDialog$207(this.f18346c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18345b.lambda$deleteMessages$123(this.f18346c, this.d, tLObject, tL_error);
                return;
        }
    }
}
