package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f18412a;
    public final MessagesController f18413b;
    public final long f18414c;
    public final long d;

    public fc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18412a = i10;
        this.f18413b = messagesController;
        this.f18414c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18412a) {
            case 0:
                this.f18413b.lambda$loadUnknownDialog$207(this.f18414c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18413b.lambda$deleteMessages$123(this.f18414c, this.d, tLObject, tL_error);
                return;
        }
    }
}
