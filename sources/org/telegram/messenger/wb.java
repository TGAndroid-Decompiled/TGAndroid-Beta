package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f19678a;
    public final MessagesController f19679b;
    public final long f19680c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19678a = i10;
        this.f19679b = messagesController;
        this.f19680c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19678a) {
            case 0:
                this.f19679b.lambda$loadUnknownDialog$208(this.f19680c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19679b.lambda$deleteMessages$124(this.f19680c, this.d, tLObject, tL_error);
                return;
        }
    }
}
