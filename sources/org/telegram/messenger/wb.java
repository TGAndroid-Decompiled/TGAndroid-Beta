package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19690a;
    public final MessagesController f19691b;
    public final long f19692c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19690a = i10;
        this.f19691b = messagesController;
        this.f19692c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19690a) {
            case 0:
                this.f19691b.lambda$loadUnknownDialog$208(this.f19692c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19691b.lambda$deleteMessages$124(this.f19692c, this.d, tLObject, tL_error);
                return;
        }
    }
}
