package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb implements RequestDelegate {
    public final int f19230a;
    public final MessagesController f19231b;
    public final long f19232c;
    public final long d;

    public vb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19230a = i10;
        this.f19231b = messagesController;
        this.f19232c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19230a) {
            case 0:
                this.f19231b.lambda$loadUnknownDialog$208(this.f19232c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19231b.lambda$deleteMessages$124(this.f19232c, this.d, tLObject, tL_error);
                return;
        }
    }
}
