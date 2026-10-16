package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements RequestDelegate {
    public final int f18716a;
    public final MessagesController f18717b;
    public final int f18718c;
    public final long d;
    public final long e;

    public xc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18716a = 0;
        this.f18717b = messagesController;
        this.d = j10;
        this.f18718c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18716a) {
            case 0:
                int i10 = this.f18718c;
                long j10 = this.e;
                this.f18717b.lambda$getChannelDifference$348(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f18717b.lambda$sendTyping$171(this.f18718c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.f18717b.lambda$sendTyping$173(this.f18718c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public xc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18716a = i11;
        this.f18717b = messagesController;
        this.f18718c = i10;
        this.d = j10;
        this.e = j11;
    }
}
