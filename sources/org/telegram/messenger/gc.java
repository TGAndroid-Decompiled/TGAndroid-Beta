package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gc implements RequestDelegate {
    public final int f20162a;
    public final MessagesController f20163b;
    public final long f20164c;
    public final long d;

    public gc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20162a = i10;
        this.f20163b = messagesController;
        this.f20164c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20162a) {
            case 0:
                this.f20163b.lambda$loadUnknownDialog$207(this.f20164c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20163b.lambda$deleteMessages$123(this.f20164c, this.d, tLObject, tL_error);
                return;
        }
    }
}
