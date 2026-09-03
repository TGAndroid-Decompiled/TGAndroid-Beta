package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nc implements RequestDelegate {
    public final int f19465a;
    public final MessagesController f19466b;
    public final int f19467c;
    public final long d;
    public final long f19468e;

    public nc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19465a = 0;
        this.f19466b = messagesController;
        this.d = j10;
        this.f19467c = i10;
        this.f19468e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19465a) {
            case 0:
                int i10 = this.f19467c;
                long j10 = this.f19468e;
                this.f19466b.lambda$getChannelDifference$349(this.d, i10, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19468e;
                this.f19466b.lambda$sendTyping$172(this.f19467c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.f19468e;
                this.f19466b.lambda$sendTyping$174(this.f19467c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public nc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f19465a = i11;
        this.f19466b = messagesController;
        this.f19467c = i10;
        this.d = j10;
        this.f19468e = j11;
    }
}
