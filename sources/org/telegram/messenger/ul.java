package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul implements RequestDelegate {
    public final int f21463a;
    public final UnconfirmedAuthController.UnconfirmedAuth f21464b;
    public final Utilities.Callback f21465c;

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f21463a = i10;
        this.f21464b = unconfirmedAuth;
        this.f21465c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21463a) {
            case 0:
                this.f21464b.lambda$deny$4(this.f21465c, tLObject, tL_error);
                return;
            case 1:
                this.f21464b.lambda$deny$6(this.f21465c, tLObject, tL_error);
                return;
            default:
                this.f21464b.lambda$confirm$2(this.f21465c, tLObject, tL_error);
                return;
        }
    }
}
