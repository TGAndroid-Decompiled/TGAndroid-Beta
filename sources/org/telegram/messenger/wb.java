package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19489a;
    public final MessagesController f19490b;
    public final long f19491c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19489a = i10;
        this.f19490b = messagesController;
        this.f19491c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19489a) {
            case 0:
                this.f19490b.lambda$loadUnknownDialog$208(this.f19491c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19490b.lambda$deleteMessages$124(this.f19491c, this.d, tLObject, tL_error);
                return;
        }
    }
}
