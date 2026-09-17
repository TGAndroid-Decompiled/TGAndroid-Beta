package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb implements RequestDelegate {
    public final int f19257a;
    public final MessagesController f19258b;
    public final long f19259c;
    public final long d;

    public vb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19257a = i10;
        this.f19258b = messagesController;
        this.f19259c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19257a) {
            case 0:
                this.f19258b.lambda$loadUnknownDialog$208(this.f19259c, this.d, tLObject, tL_error);
                return;
            default:
                this.f19258b.lambda$deleteMessages$124(this.f19259c, this.d, tLObject, tL_error);
                return;
        }
    }
}
