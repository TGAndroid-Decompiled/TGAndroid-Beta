package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nc implements RequestDelegate {
    public final int f17934a;
    public final MessagesController f17935b;
    public final int f17936c;
    public final long d;
    public final long e;

    public nc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17934a = 0;
        this.f17935b = messagesController;
        this.d = j10;
        this.f17936c = i10;
        this.e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17934a) {
            case 0:
                int i10 = this.f17936c;
                long j10 = this.e;
                this.f17935b.lambda$getChannelDifference$349(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f17935b.lambda$sendTyping$172(this.f17936c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.f17935b.lambda$sendTyping$174(this.f17936c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public nc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f17934a = i11;
        this.f17935b = messagesController;
        this.f17936c = i10;
        this.d = j10;
        this.e = j11;
    }
}
