package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xl implements Runnable {
    public final int f19612a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19613b;
    public final TLObject f19614c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19615e;

    public xl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19612a = 1;
        this.f19613b = unconfirmedAuth;
        this.f19614c = tLObject;
        this.d = callback;
        this.f19615e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19612a) {
            case 0:
                this.f19613b.lambda$confirm$1(this.d, this.f19614c, this.f19615e);
                return;
            case 1:
                this.f19613b.lambda$deny$3(this.f19614c, this.d, this.f19615e);
                return;
            default:
                this.f19613b.lambda$deny$5(this.d, this.f19614c, this.f19615e);
                return;
        }
    }

    public xl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19612a = i10;
        this.f19613b = unconfirmedAuth;
        this.d = callback;
        this.f19614c = tLObject;
        this.f19615e = tL_error;
    }
}
