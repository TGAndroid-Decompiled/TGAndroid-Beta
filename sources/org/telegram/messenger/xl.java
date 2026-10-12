package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f19613a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19614b;
    public final TLObject f19615c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19616e;

    public xl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19613a = 1;
        this.f19614b = unconfirmedAuth;
        this.f19615c = tLObject;
        this.d = callback;
        this.f19616e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19613a) {
            case 0:
                this.f19614b.lambda$confirm$1(this.d, this.f19615c, this.f19616e);
                return;
            case 1:
                this.f19614b.lambda$deny$3(this.f19615c, this.d, this.f19616e);
                return;
            default:
                this.f19614b.lambda$deny$5(this.d, this.f19615c, this.f19616e);
                return;
        }
    }

    public xl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19613a = i10;
        this.f19614b = unconfirmedAuth;
        this.d = callback;
        this.f19615c = tLObject;
        this.f19616e = tL_error;
    }
}
