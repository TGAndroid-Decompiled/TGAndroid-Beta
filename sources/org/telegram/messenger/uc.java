package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uc implements RequestDelegate {
    public final int f19664a;
    public final MessagesController f19665b;
    public final int f19666c;
    public final long d;
    public final long e;

    public uc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19664a = 0;
        this.f19665b = messagesController;
        this.d = j10;
        this.f19666c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19664a) {
            case 0:
                int i10 = this.f19666c;
                long j10 = this.e;
                this.f19665b.lambda$getChannelDifference$348(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f19665b.lambda$sendTyping$171(this.f19666c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.f19665b.lambda$sendTyping$173(this.f19666c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public uc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f19664a = i11;
        this.f19665b = messagesController;
        this.f19666c = i10;
        this.d = j10;
        this.e = j11;
    }
}
