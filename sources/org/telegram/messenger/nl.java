package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class nl implements Runnable {

    public final int f21108a;

    public final UnconfirmedAuthController.UnconfirmedAuth f21109b;

    public final TLObject f21110c;
    public final Utilities.Callback d;

    public final TLRPC.TL_error f21111e;

    public nl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21108a = 1;
        this.f21109b = unconfirmedAuth;
        this.f21110c = tLObject;
        this.d = callback;
        this.f21111e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21108a) {
            case 0:
                this.f21109b.lambda$confirm$1(this.d, this.f21110c, this.f21111e);
                break;
            case 1:
                this.f21109b.lambda$deny$3(this.f21110c, this.d, this.f21111e);
                break;
            default:
                this.f21109b.lambda$deny$5(this.d, this.f21110c, this.f21111e);
                break;
        }
    }

    public nl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21108a = i10;
        this.f21109b = unconfirmedAuth;
        this.d = callback;
        this.f21110c = tLObject;
        this.f21111e = tL_error;
    }
}
