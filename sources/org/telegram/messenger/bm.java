package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bm implements RequestDelegate {
    public final int f14817a;
    public final UnconfirmedAuthController.UnconfirmedAuth f14818b;
    public final Utilities.Callback f14819c;

    public bm(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f14817a = i10;
        this.f14818b = unconfirmedAuth;
        this.f14819c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14817a) {
            case 0:
                this.f14818b.lambda$deny$4(this.f14819c, tLObject, tL_error);
                return;
            case 1:
                this.f14818b.lambda$deny$6(this.f14819c, tLObject, tL_error);
                return;
            default:
                this.f14818b.lambda$confirm$2(this.f14819c, tLObject, tL_error);
                return;
        }
    }
}
