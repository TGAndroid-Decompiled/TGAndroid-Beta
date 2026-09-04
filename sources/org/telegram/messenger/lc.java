package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lc implements RequestDelegate {
    public final int f18265a;
    public final MessagesController f18266b;
    public final int f18267c;
    public final long d;
    public final long f18268e;

    public lc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18265a = 0;
        this.f18266b = messagesController;
        this.d = j3;
        this.f18267c = i10;
        this.f18268e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18265a) {
            case 0:
                int i10 = this.f18267c;
                long j3 = this.f18268e;
                this.f18266b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f18268e;
                this.f18266b.lambda$sendTyping$172(this.f18267c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f18268e;
                this.f18266b.lambda$sendTyping$174(this.f18267c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public lc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18265a = i11;
        this.f18266b = messagesController;
        this.f18267c = i10;
        this.d = j3;
        this.f18268e = j10;
    }
}
