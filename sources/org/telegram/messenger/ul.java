package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul implements Runnable {
    public final int f20231a;
    public final UnconfirmedAuthController.UnconfirmedAuth f20232b;
    public final TLObject f20233c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f20234e;

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20231a = 1;
        this.f20232b = unconfirmedAuth;
        this.f20233c = tLObject;
        this.d = callback;
        this.f20234e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20231a) {
            case 0:
                this.f20232b.lambda$confirm$1(this.d, this.f20233c, this.f20234e);
                return;
            case 1:
                this.f20232b.lambda$deny$3(this.f20233c, this.d, this.f20234e);
                return;
            default:
                this.f20232b.lambda$deny$5(this.d, this.f20233c, this.f20234e);
                return;
        }
    }

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f20231a = i10;
        this.f20232b = unconfirmedAuth;
        this.d = callback;
        this.f20233c = tLObject;
        this.f20234e = tL_error;
    }
}
