package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc implements RequestDelegate {
    public final int f18185a;
    public final MessagesController f18186b;
    public final int f18187c;
    public final long d;
    public final long f18188e;

    public kc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18185a = 0;
        this.f18186b = messagesController;
        this.d = j3;
        this.f18187c = i10;
        this.f18188e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18185a) {
            case 0:
                int i10 = this.f18187c;
                long j3 = this.f18188e;
                this.f18186b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f18188e;
                this.f18186b.lambda$sendTyping$172(this.f18187c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f18188e;
                this.f18186b.lambda$sendTyping$174(this.f18187c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public kc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18185a = i11;
        this.f18186b = messagesController;
        this.f18187c = i10;
        this.d = j3;
        this.f18188e = j10;
    }
}
