package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f17557a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17558b;
    public final Utilities.Callback f17559c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17557a = i10;
        this.f17558b = unconfirmedAuth;
        this.f17559c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17557a) {
            case 0:
                this.f17558b.lambda$deny$4(this.f17559c, tLObject, tL_error);
                return;
            case 1:
                this.f17558b.lambda$deny$6(this.f17559c, tLObject, tL_error);
                return;
            default:
                this.f17558b.lambda$confirm$2(this.f17559c, tLObject, tL_error);
                return;
        }
    }
}
