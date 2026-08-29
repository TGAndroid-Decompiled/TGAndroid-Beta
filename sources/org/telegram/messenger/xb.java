package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xb implements RequestDelegate {
    public final int f22167a;
    public final MessagesController f22168b;
    public final long f22169c;
    public final long d;

    public xb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f22167a = i10;
        this.f22168b = messagesController;
        this.f22169c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22167a) {
            case 0:
                this.f22168b.lambda$loadUnknownDialog$208(this.f22169c, this.d, tLObject, tL_error);
                return;
            default:
                this.f22168b.lambda$deleteMessages$124(this.f22169c, this.d, tLObject, tL_error);
                return;
        }
    }
}
