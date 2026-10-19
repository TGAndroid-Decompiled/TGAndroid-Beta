package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements RequestDelegate {
    public final int f19302a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19303b;
    public final Utilities.Callback f19304c;

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19302a = i10;
        this.f19303b = unconfirmedAuth;
        this.f19304c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19302a) {
            case 0:
                this.f19303b.lambda$deny$4(this.f19304c, tLObject, tL_error);
                return;
            case 1:
                this.f19303b.lambda$deny$6(this.f19304c, tLObject, tL_error);
                return;
            default:
                this.f19303b.lambda$confirm$2(this.f19304c, tLObject, tL_error);
                return;
        }
    }
}
