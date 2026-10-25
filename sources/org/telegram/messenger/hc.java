package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hc implements RequestDelegate {
    public final int f20250a;
    public final MessagesController f20251b;
    public final long f20252c;
    public final long d;

    public hc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20250a = i10;
        this.f20251b = messagesController;
        this.f20252c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20250a) {
            case 0:
                this.f20251b.lambda$loadUnknownDialog$207(this.f20252c, this.d, tLObject, tL_error);
                return;
            default:
                this.f20251b.lambda$deleteMessages$123(this.f20252c, this.d, tLObject, tL_error);
                return;
        }
    }
}
