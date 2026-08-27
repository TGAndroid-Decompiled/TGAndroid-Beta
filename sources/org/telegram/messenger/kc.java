package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class kc implements RequestDelegate {

    public final int f20769a;

    public final MessagesController f20770b;

    public final int f20771c;
    public final long d;

    public final long f20772e;

    public kc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20769a = 0;
        this.f20770b = messagesController;
        this.d = j10;
        this.f20771c = i10;
        this.f20772e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20769a) {
            case 0:
                int i10 = this.f20771c;
                long j10 = this.f20772e;
                this.f20770b.lambda$getChannelDifference$349(this.d, i10, j10, tLObject, tL_error);
                break;
            case 1:
                long j11 = this.d;
                long j12 = this.f20772e;
                this.f20770b.lambda$sendTyping$172(this.f20771c, j11, j12, tLObject, tL_error);
                break;
            default:
                long j13 = this.d;
                long j14 = this.f20772e;
                this.f20770b.lambda$sendTyping$174(this.f20771c, j13, j14, tLObject, tL_error);
                break;
        }
    }

    public kc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20769a = i11;
        this.f20770b = messagesController;
        this.f20771c = i10;
        this.d = j10;
        this.f20772e = j11;
    }
}
