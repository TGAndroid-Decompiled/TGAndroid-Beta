package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f19046a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19047b;
    public final Utilities.Callback f19048c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19046a = i10;
        this.f19047b = unconfirmedAuth;
        this.f19048c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19046a) {
            case 0:
                this.f19047b.lambda$deny$4(this.f19048c, tLObject, tL_error);
                return;
            case 1:
                this.f19047b.lambda$deny$6(this.f19048c, tLObject, tL_error);
                return;
            default:
                this.f19047b.lambda$confirm$2(this.f19048c, tLObject, tL_error);
                return;
        }
    }
}
