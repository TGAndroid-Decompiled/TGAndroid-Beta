package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f16940a;
    public final MessagesController f16941b;
    public final long f16942c;
    public final long d;

    public fc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f16940a = i10;
        this.f16941b = messagesController;
        this.f16942c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16940a) {
            case 0:
                this.f16941b.lambda$loadUnknownDialog$207(this.f16942c, this.d, tLObject, tL_error);
                return;
            default:
                this.f16941b.lambda$deleteMessages$123(this.f16942c, this.d, tLObject, tL_error);
                return;
        }
    }
}
