package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements Runnable {
    public final int f19299a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19300b;
    public final TLObject f19301c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19299a = 1;
        this.f19300b = unconfirmedAuth;
        this.f19301c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19299a) {
            case 0:
                this.f19300b.lambda$confirm$1(this.d, this.f19301c, this.e);
                return;
            case 1:
                this.f19300b.lambda$deny$3(this.f19301c, this.d, this.e);
                return;
            default:
                this.f19300b.lambda$deny$5(this.d, this.f19301c, this.e);
                return;
        }
    }

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19299a = i10;
        this.f19300b = unconfirmedAuth;
        this.d = callback;
        this.f19301c = tLObject;
        this.e = tL_error;
    }
}
