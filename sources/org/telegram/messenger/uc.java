package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uc implements RequestDelegate {
    public final int f19340a;
    public final MessagesController f19341b;
    public final int f19342c;
    public final long d;
    public final long f19343e;

    public uc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19340a = 0;
        this.f19341b = messagesController;
        this.d = j3;
        this.f19342c = i10;
        this.f19343e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19340a) {
            case 0:
                int i10 = this.f19342c;
                long j3 = this.f19343e;
                this.f19341b.lambda$getChannelDifference$348(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f19343e;
                this.f19341b.lambda$sendTyping$171(this.f19342c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f19343e;
                this.f19341b.lambda$sendTyping$173(this.f19342c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public uc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19340a = i11;
        this.f19341b = messagesController;
        this.f19342c = i10;
        this.d = j3;
        this.f19343e = j10;
    }
}
