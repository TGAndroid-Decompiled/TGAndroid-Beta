package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lc implements RequestDelegate {
    public final int f16915a;
    public final MessagesController f16916b;
    public final int f16917c;
    public final long d;
    public final long e;

    public lc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f16915a = 0;
        this.f16916b = messagesController;
        this.d = j3;
        this.f16917c = i10;
        this.e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16915a) {
            case 0:
                int i10 = this.f16917c;
                long j3 = this.e;
                this.f16916b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.e;
                this.f16916b.lambda$sendTyping$172(this.f16917c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.e;
                this.f16916b.lambda$sendTyping$174(this.f16917c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public lc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f16915a = i11;
        this.f16916b = messagesController;
        this.f16917c = i10;
        this.d = j3;
        this.e = j10;
    }
}
