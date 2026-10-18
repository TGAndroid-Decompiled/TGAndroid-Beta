package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements RequestDelegate {
    public final int f19299a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19300b;
    public final Utilities.Callback f19301c;

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19299a = i10;
        this.f19300b = unconfirmedAuth;
        this.f19301c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19299a) {
            case 0:
                this.f19300b.lambda$deny$4(this.f19301c, tLObject, tL_error);
                return;
            case 1:
                this.f19300b.lambda$deny$6(this.f19301c, tLObject, tL_error);
                return;
            default:
                this.f19300b.lambda$confirm$2(this.f19301c, tLObject, tL_error);
                return;
        }
    }
}
