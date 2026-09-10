package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dc implements RequestDelegate {
    public final int f15001a;
    public final MessagesController f15002b;
    public final long f15003c;
    public final long d;

    public dc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f15001a = i10;
        this.f15002b = messagesController;
        this.f15003c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15001a) {
            case 0:
                this.f15002b.lambda$loadUnknownDialog$208(this.f15003c, this.d, tLObject, tL_error);
                return;
            default:
                this.f15002b.lambda$deleteMessages$124(this.f15003c, this.d, tLObject, tL_error);
                return;
        }
    }
}
