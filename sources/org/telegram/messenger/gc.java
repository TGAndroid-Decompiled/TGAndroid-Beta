package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gc implements RequestDelegate {
    public final int f20381a;
    public final MessagesController f20382b;
    public final int f20383c;
    public final long d;
    public final long f20384e;

    public gc(int i9, long j10, long j11, MessagesController messagesController) {
        this.f20381a = 0;
        this.f20382b = messagesController;
        this.d = j10;
        this.f20383c = i9;
        this.f20384e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20381a) {
            case 0:
                int i9 = this.f20383c;
                long j10 = this.f20384e;
                this.f20382b.lambda$getChannelDifference$349(this.d, i9, j10, tLObject, tL_error);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f20384e;
                this.f20382b.lambda$sendTyping$172(this.f20383c, j11, j12, tLObject, tL_error);
                return;
            default:
                long j13 = this.d;
                long j14 = this.f20384e;
                this.f20382b.lambda$sendTyping$174(this.f20383c, j13, j14, tLObject, tL_error);
                return;
        }
    }

    public gc(MessagesController messagesController, int i9, long j10, long j11, int i10) {
        this.f20381a = i10;
        this.f20382b = messagesController;
        this.f20383c = i9;
        this.d = j10;
        this.f20384e = j11;
    }
}
