package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements RequestDelegate {
    public final int f20139a;
    public final MessagesController f20140b;
    public final int f20141c;
    public final long d;
    public final long e;

    public xc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20139a = 0;
        this.f20140b = messagesController;
        this.d = j10;
        this.f20141c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20139a) {
            case 0:
                int i10 = this.f20141c;
                long j10 = this.e;
                this.f20140b.lambda$getChannelDifference$348(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f20140b.lambda$sendTyping$171(this.f20141c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.f20140b.lambda$sendTyping$173(this.f20141c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public xc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20139a = i11;
        this.f20140b = messagesController;
        this.f20141c = i10;
        this.d = j10;
        this.e = j11;
    }
}
