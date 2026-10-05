package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lc implements RequestDelegate {
    public final int f18465a;
    public final MessagesController f18466b;
    public final int f18467c;
    public final long d;
    public final long f18468e;

    public lc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18465a = 0;
        this.f18466b = messagesController;
        this.d = j3;
        this.f18467c = i10;
        this.f18468e = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18465a) {
            case 0:
                int i10 = this.f18467c;
                long j3 = this.f18468e;
                this.f18466b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.d;
                long j11 = this.f18468e;
                this.f18466b.lambda$sendTyping$172(this.f18467c, j10, j11, tLObject, tL_error);
                return;
            default:
                long j12 = this.d;
                long j13 = this.f18468e;
                this.f18466b.lambda$sendTyping$174(this.f18467c, j12, j13, tLObject, tL_error);
                return;
        }
    }

    public lc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18465a = i11;
        this.f18466b = messagesController;
        this.f18467c = i10;
        this.d = j3;
        this.f18468e = j10;
    }
}
