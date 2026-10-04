package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19689a;
    public final MessagesController f19690b;
    public final long f19691c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19689a = i10;
        this.f19690b = messagesController;
        this.f19691c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19689a) {
            case 0:
                this.f19690b.lambda$loadUnknownDialog$208(this.f19691c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19690b.lambda$deleteMessages$124(this.f19691c, this.d, tLObject, tL_error);
                return;
        }
    }
}
