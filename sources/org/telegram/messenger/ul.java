package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul implements Runnable {
    public final int f20233a;
    public final UnconfirmedAuthController.UnconfirmedAuth f20234b;
    public final TLObject f20235c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f20236e;

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20233a = 1;
        this.f20234b = unconfirmedAuth;
        this.f20235c = tLObject;
        this.d = callback;
        this.f20236e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20233a) {
            case 0:
                this.f20234b.lambda$confirm$1(this.d, this.f20235c, this.f20236e);
                return;
            case 1:
                this.f20234b.lambda$deny$3(this.f20235c, this.d, this.f20236e);
                return;
            default:
                this.f20234b.lambda$deny$5(this.d, this.f20235c, this.f20236e);
                return;
        }
    }

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f20233a = i10;
        this.f20234b = unconfirmedAuth;
        this.d = callback;
        this.f20235c = tLObject;
        this.f20236e = tL_error;
    }
}
