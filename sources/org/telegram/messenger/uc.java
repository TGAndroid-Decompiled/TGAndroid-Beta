package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uc implements RequestDelegate {
    public final int f19342a;
    public final MessagesController f19343b;
    public final int f19344c;
    public final long d;
    public final long f19345e;

    public uc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19342a = 0;
        this.f19343b = messagesController;
        this.d = j3;
        this.f19344c = i10;
        this.f19345e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19342a) {
            case 0:
                int i10 = this.f19344c;
                long j3 = this.f19345e;
                this.f19343b.lambda$getChannelDifference$348(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f19345e;
                this.f19343b.lambda$sendTyping$171(this.f19344c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f19345e;
                this.f19343b.lambda$sendTyping$173(this.f19344c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public uc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19342a = i11;
        this.f19343b = messagesController;
        this.f19344c = i10;
        this.d = j3;
        this.f19345e = j10;
    }
}
