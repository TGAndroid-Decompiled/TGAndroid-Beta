package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f19019a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19020b;
    public final Utilities.Callback f19021c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19019a = i10;
        this.f19020b = unconfirmedAuth;
        this.f19021c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19019a) {
            case 0:
                this.f19020b.lambda$deny$4(this.f19021c, tLObject, tL_error);
                return;
            case 1:
                this.f19020b.lambda$deny$6(this.f19021c, tLObject, tL_error);
                return;
            default:
                this.f19020b.lambda$confirm$2(this.f19021c, tLObject, tL_error);
                return;
        }
    }
}
