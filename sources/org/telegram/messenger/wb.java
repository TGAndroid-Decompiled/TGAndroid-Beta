package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19683a;
    public final MessagesController f19684b;
    public final long f19685c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19683a = i10;
        this.f19684b = messagesController;
        this.f19685c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19683a) {
            case 0:
                this.f19684b.lambda$loadUnknownDialog$208(this.f19685c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19684b.lambda$deleteMessages$124(this.f19685c, this.d, tLObject, tL_error);
                return;
        }
    }
}
