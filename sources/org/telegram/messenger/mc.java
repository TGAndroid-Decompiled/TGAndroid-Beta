package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mc implements RequestDelegate {
    public final int f20954a;
    public final MessagesController f20955b;
    public final int f20956c;
    public final long d;
    public final long f20957e;

    public mc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20954a = 0;
        this.f20955b = messagesController;
        this.d = j10;
        this.f20956c = i10;
        this.f20957e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20954a) {
            case 0:
                int i10 = this.f20956c;
                long j10 = this.f20957e;
                this.f20955b.lambda$getChannelDifference$349(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f20957e;
                this.f20955b.lambda$sendTyping$172(this.f20956c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.f20957e;
                this.f20955b.lambda$sendTyping$174(this.f20956c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public mc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20954a = i11;
        this.f20955b = messagesController;
        this.f20956c = i10;
        this.d = j10;
        this.f20957e = j11;
    }
}
