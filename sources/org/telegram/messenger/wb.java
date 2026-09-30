package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f18041a;
    public final MessagesController f18042b;
    public final long f18043c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18041a = i10;
        this.f18042b = messagesController;
        this.f18043c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18041a) {
            case 0:
                this.f18042b.lambda$loadUnknownDialog$208(this.f18043c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18042b.lambda$deleteMessages$124(this.f18043c, this.d, tLObject, tL_error);
                return;
        }
    }
}
