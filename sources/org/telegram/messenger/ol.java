package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ol implements RequestDelegate {

    public final int f21201a;

    public final UnconfirmedAuthController.UnconfirmedAuth f21202b;

    public final Utilities.Callback f21203c;

    public ol(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f21201a = i10;
        this.f21202b = unconfirmedAuth;
        this.f21203c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21201a) {
            case 0:
                this.f21202b.lambda$deny$4(this.f21203c, tLObject, tL_error);
                break;
            case 1:
                this.f21202b.lambda$deny$6(this.f21203c, tLObject, tL_error);
                break;
            default:
                this.f21202b.lambda$confirm$2(this.f21203c, tLObject, tL_error);
                break;
        }
    }
}
