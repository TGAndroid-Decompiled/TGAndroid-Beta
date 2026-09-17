package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc implements RequestDelegate {
    public final int f18212a;
    public final MessagesController f18213b;
    public final int f18214c;
    public final long d;
    public final long f18215e;

    public kc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18212a = 0;
        this.f18213b = messagesController;
        this.d = j3;
        this.f18214c = i10;
        this.f18215e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18212a) {
            case 0:
                int i10 = this.f18214c;
                long j3 = this.f18215e;
                this.f18213b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f18215e;
                this.f18213b.lambda$sendTyping$172(this.f18214c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f18215e;
                this.f18213b.lambda$sendTyping$174(this.f18214c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public kc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18212a = i11;
        this.f18213b = messagesController;
        this.f18214c = i10;
        this.d = j3;
        this.f18215e = j10;
    }
}
