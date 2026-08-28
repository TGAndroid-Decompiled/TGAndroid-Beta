package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rb implements RequestDelegate {
    public final int f21397a;
    public final MessagesController f21398b;
    public final long f21399c;
    public final long d;

    public rb(int i9, long j10, long j11, MessagesController messagesController) {
        this.f21397a = i9;
        this.f21398b = messagesController;
        this.f21399c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21397a) {
            case 0:
                this.f21398b.lambda$loadUnknownDialog$208(this.f21399c, this.d, tLObject, tL_error);
                return;
            default:
                this.f21398b.lambda$deleteMessages$124(this.f21399c, this.d, tLObject, tL_error);
                return;
        }
    }
}
