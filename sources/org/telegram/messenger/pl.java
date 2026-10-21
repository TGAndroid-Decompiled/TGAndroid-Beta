package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements Runnable {
    public final int f19296a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19297b;
    public final TLObject f19298c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19296a = 1;
        this.f19297b = unconfirmedAuth;
        this.f19298c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19296a) {
            case 0:
                this.f19297b.lambda$confirm$1(this.d, this.f19298c, this.e);
                return;
            case 1:
                this.f19297b.lambda$deny$3(this.f19298c, this.d, this.e);
                return;
            default:
                this.f19297b.lambda$deny$5(this.d, this.f19298c, this.e);
                return;
        }
    }

    public pl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19296a = i10;
        this.f19297b = unconfirmedAuth;
        this.d = callback;
        this.f19298c = tLObject;
        this.e = tL_error;
    }
}
