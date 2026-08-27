package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class vb implements RequestDelegate {

    public final int f21792a;

    public final MessagesController f21793b;

    public final long f21794c;
    public final long d;

    public vb(int i10, long j10, long j11, MessagesController messagesController) {
        this.f21792a = i10;
        this.f21793b = messagesController;
        this.f21794c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21792a) {
            case 0:
                this.f21793b.lambda$loadUnknownDialog$208(this.f21794c, this.d, tLObject, tL_error);
                break;
            default:
                this.f21793b.lambda$deleteMessages$124(this.f21794c, this.d, tLObject, tL_error);
                break;
        }
    }
}
