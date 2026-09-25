package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f18017a;
    public final MessagesController f18018b;
    public final long f18019c;
    public final long d;

    public wb(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18017a = i10;
        this.f18018b = messagesController;
        this.f18019c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18017a) {
            case 0:
                this.f18018b.lambda$loadUnknownDialog$208(this.f18019c, this.d, tLObject, tL_error);
                return;
            default:
                this.f18018b.lambda$deleteMessages$124(this.f18019c, this.d, tLObject, tL_error);
                return;
        }
    }
}
