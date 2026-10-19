package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tc implements RequestDelegate {
    public final int f19577a;
    public final MessagesController f19578b;
    public final int f19579c;
    public final long d;
    public final long e;

    public tc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19577a = 0;
        this.f19578b = messagesController;
        this.d = j10;
        this.f19579c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19577a) {
            case 0:
                int i10 = this.f19579c;
                long j10 = this.e;
                this.f19578b.lambda$getChannelDifference$348(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f19578b.lambda$sendTyping$171(this.f19579c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.f19578b.lambda$sendTyping$173(this.f19579c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public tc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f19577a = i11;
        this.f19578b = messagesController;
        this.f19579c = i10;
        this.d = j10;
        this.e = j11;
    }
}
